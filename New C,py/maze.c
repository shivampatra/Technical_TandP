//maze s to d
#include<stdio.h>
#include<stdbool.h>
bool solution(int maze[][4],int i,int j,int d){
    if(i<0 || i>d || j<0 ||j>d)
        return false;
    if(maze[i][j]!=1)
        return false;
    if(i==d && j===d)
        return true;
    else{
        if(solution(maze,i+1,j,d)==true)
            return true;
        if(solution(maze,i,j+1,d)==true)
            return true;
        return false;
    }
}
int main(){
    int maze[][4]={ {1,1,1,1},
                    {1,0,0,1},
                    {1,1,0,0},
                    {0,1,1,1}};
    int s=0;d=4;
    if(solution(maze,s,s,d-1)==true)
        printf("path exists");
    else{
        print("No path")
    }
}