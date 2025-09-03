//Red BLack Tree
#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *left;
    struct Node *right;
    struct Node *parent;
    char color;
};
struct Node *mroot=NULL;
bool ll = false;
bool rr = false;
bool rl = false;
bool lr = false;
void levelhelp(struct Node *root,int l){
    if(root==NULL)
    return;
    if(l==1){
        printf("%d",root->data)
    }
}
int height(struct Node *root){
    if(root==NULL)
    return 0;

}
void level(struct Node *root){
    int h=height(root)+1;
    for(int i=1;i<=h;i++){
        for(int j=i;j<=h;j++)
        printf(" ");
    printf("%d")
    }
}
struct Node* leftrotate(struct Node*root){
    struct Node *t1=root->right;
    struct Node *t2=t1->left;
    root->right=t2;
    t1->left=root;
    root->parent=t1;
    if(t2!=NULL){
        t2->parent=root;
    }
    return t1;
}
struct Node *inserthelp(struct Node *root,int data){
    if(root ==NULL){
        struct Node *nn=malloc(sizeof(struct Node));
        nn->left = NULL;
        nn->right = NULL;
        nn->parent = NULL;
        nn->color='r';
        mroot=nn;
        return nn;
    }
    else if(data<root->data){
        root->left=inserthelp(root->left,data);
        root->left->parent=root;
        if(root!=mroot){
            if(root->color=='r' && root->left->color=='r')
            flag=true;
        }
    }




















    if(rl==true){
        root->left=rightrotate(root->right);
        root->left->parent=root;
        root=leftrotate(root);
        root->color='b';
        root->right->color='r';
        rl=false;
    }
    if(lr==true){
        root->left=leftrotate(root->right);
        root->right->parent=root;
        root=rightrotate(root);
        root->color='b';
        root->left->color='r';
        lr=false;
    }
    if(flag==true){
        if(root->parent->left==NULL or 
        root->parent->left->color=='b'){
            if(root->right!=NULL && root->right->color=='r'){
                rr=true;
            }
            else if(root->left!=NULL && root->left->color=='r'){
                rl=true;
            }
        }
        if(root->parent->right==NULL or 
        root->parent->right->color=='b'){
            if(root->left!=NULL && root->left->color=='r'){
                ll=true;
            }
            else if(root->right!=NULL && root->right->color=='r'){
                lr=true;
            }
        }
        if(root->parent->left->color=='r'){
            root->color='b';
            root->parent->left->color='b';
            if(root->parent!=mroot){
                root->parent->color='r';
            }
        }
        if(root->parent->right->color=='r'){
            root->color='b';
            root->parent->right->color='b';
            if(root->parent!=mroot){
                root->parent->color='r';
            }
        }
        flag=false;
    }
    return root;
}
void insert(data)
{
    if(mroot==NULL){
        struct Node *nn=malloc(sizeof(struct Node));
    }
}
















int main{
    insert(5)
}