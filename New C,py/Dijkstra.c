//Dijkstra's
#include<stdio.h>
#include<stdbool.h>
void dijkstra(int graph[][4],int v){
    bool visited[v];
    int distance[v];
    int start=0;
    for(int i=0;i<v;i++)
        visited[i]=false;
    for(int i=0;i<v;i++)
        distance[i]=graph[start][i];
    visited[start]=true;
    distance[start]=0;
    int count=1;
    int newnode=-1;
    while(count<v-1){
        int min=10000;
        for(int i=0;i<v;i++){
            if(visited[i]!=true){
                if(distance[i]<min){
                    min=distance[i];
                    newnode=i;
                }
            }
        }
        visited[newnode]=true;
        for(int i=0;i<v;i++){
            if(visited[i]!=true){
                if(graph[newnode][i]!=0){
                    if(min+graph[newnode][i]<distance[i]){
                        distance[i]=min+graph[newnode][i];
                    }
                }
            }           
        }
        count+=1;
    }
    printf("%d -> ",start);
    for(int i=0;i<v;i++)
        printf(" %d ",distance[i]);
}
int main(){
    int graph[][4]={{0,1,7,8},
                    {1,0,1,2},
                    {2,3,0,1},
                    {1,1,1,0}};
    int vertex = 4;
    dijkstra(graph,vertex);
    
}
