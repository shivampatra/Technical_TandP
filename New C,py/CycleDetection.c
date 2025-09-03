//Cycle Detection in a graph
#include<stdio.h>
#include<stdbool.h>
bool cycle(int graph[][4],bool visited[],int s,int p,int v){
    visited[s]=true;
    for(int i=0;i<v;i++){
        if(graph[s][i]!=0 && visited[i]!=true){
            if(cycle(graph,visited,i,s,v)==true)
                return true;
            else if(s != p)
            return true;
        }
    }
    return false;
}
int main(){
    int graph[][4]={{0,1,0,0},
                    {0,0,1,0},
                    {0,0,0,1},
                    {1,0,0,0}};
    int v=4,s=0,p=-1;
    bool visited[v];
    for(int i=0;i<v;i++)
        visited[i]=false;
    if(cycle(graph,visited,s,p,v)==true)
        printf("Cycle Detected");
    else
    printf("No Cycles");
}
