//Flood Fill Algo
#include<stdio.h>
void solution(char f[][4],char nc,char oc,int i,int j){
    if(i<0 || i>3 || j<0 ||j>3)
        return;
    if(f[i][j]!=oc)
        return;
    if(f[i][j]==nc)
        return;
    if(f[i][j]==oc)
        f[i][j]=nc;
    solution(f,nc,oc,i+1,j);
    solution(f,nc,oc,i-1,j);
    solution(f,nc,oc,i,j+1);
    solution(f,nc,oc,i,j-1);
    }
int main(){
    char flood[][4]={{'r','r','b','b'},
                    {'r','g','g','b'},
                    {'r','g','g','b'},
                    {'b','g','b','b'}};
    char newcolor='o';
    int i=3,j=1;
    char oldcolor=flood[i][j];
    solution(flood,newcolor,oldcolor,i,j);
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
        printf("%c",flood[i][j]);
    printf("\n");
    }
}