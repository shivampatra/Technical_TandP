
#include<stdio.h>
void solution(int I[][4],int i,int j){
    if(i<0 || i>3 || j<0 ||j>3)
        return;
    if(I[i][j]==0)
        return;
    if(I[i][j]==1)
       I[i][j]=0;
    solution(I,i+1,j);
    solution(I,i-1,j);
    solution(I,i,j+1);
    solution(I,i,j-1);
    }
int main(){
    int Island[][4]={{1,1,0,1},
                    {1,0,0,1},
                    {0,0,0,0},
                    {1,1,0,0}};
    int c=0;
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++)
            if(Island[i][j]==1){
                c+=1;
                solution(Island,i,j)
        }
    }
}
.
..
...
....
.....//Some codes are missing......