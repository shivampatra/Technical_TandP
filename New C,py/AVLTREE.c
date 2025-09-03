#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *left;
    struct Node *right;
    int height;
};
int getheight(struct Node*);
void levelhelper(struct Node* root,int l){
    if(root==NULL){
        return;
    }
    if(l==1){
        printf("%d ",root->data);
    }
    else{
        levelhelper(root->left,l-1);
        levelhelper(root->right,l-1);
    }
}
void levelorder(struct Node *root){
    int h = root->height+1;
    for(int i=1;i<=h;i++){
        for(int j=i;j<=h;j++)
            printf(" ");
        levelhelper(root,i);
        printf("\n");
    }
}
struct Node *leftrotate(struct Node*root){
    struct Node *t1=root->right;
    struct Node *t2=t1->left;
    root->right=t2;
    t1->left=root;
    int l = 1+getheight(root->left);
    int r = 1+getheight(root->right);
    root->height=(l>r)?l:r;
    return t1;
}
struct Node *rightrotate(struct Node*root){
    struct Node *t1=root->left;
    struct Node *t2=t1->right;
    root->left=t2;
    t1->right=root;
    int l = 1+getheight(root->left);
    int r = 1+getheight(root->right);
    root->height=(l>r)?l:r;
    return t1;
}
int getbalance(struct Node* root){
    if(root ==NULL){
        return 0;
    }
    else
        return getheight(root->left)-getheight(root->right);
}
int getheight(struct Node *root){
    if(root==NULL)
        return 0;
    else
        return root->height;
}
struct Node* insert(struct Node* root ,int data){
    if (root==NULL){
        struct Node *nn=(struct Node*)malloc(sizeof(struct Node));
        nn->data=data;
        nn->left=NULL; 
        nn->right=NULL; 
        nn->height=1; 
        return nn;
    }
    else if(data<root->data)
        root->left=insert(root->left,data);
    else if(data>root->data)
        root->right=insert(root->right,data);

int l = 1+getheight(root->left);
int r = 1+getheight(root->right);
root->height=(l>r)?l:r;
int balance = getbalance(root);
if(balance>1){
    if(data<root->left->data){
        root=rightrotate(root); //LL=R
        return root;
    }
    else if(data>root->left->data){
        root->left=leftrotate(root->left); //LR=LR
        root=rightrotate(root);
        return root;
    }
}
else if(balance<-1){
    if(data>root->right->data){ //RR=L
        root = leftrotate(root);
        return root;
    }
    else if(data<root->right->data){
        root->right=leftrotate(root->right);
        root=leftrotate(root);
        return root;
    }
}
return root;
}//

int main(){
    struct Node *root=NULL;
    root=insert(root,5);
    root=insert(root,3);
    root=insert(root,2);
    levelorder(root);
}

