//knapsack
#include<stdio.h>
int sol(int wt[],int pr[],int cap,int n){
    if(cap==0|| n<0)
    return 0;
    if(wt[n]>cap){
        return 0+sol(wt,pr,cap,n-1);
    }
    else{
     int notpick = 0+sol(wt,pr,cap,n-1);
     int pick = pr[n]+sol(wt,pr,cap-wt[n],n-1);
     return (notpick>pick)?notpick:pick;
    }
}
int main(){
    int wt[] = {7,3,4,2,1};
    int pr[] = {3,6,2,5,4};
    int sackcap = 12;
    int items = sizeof(wt)/sizeof(wt[0]);
    printf("%d",sol(wt,pr,sackcap,items-1));
    
}