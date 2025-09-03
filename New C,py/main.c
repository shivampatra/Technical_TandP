#include<stdio.h>
int sol(int n,int ar[]){
    if(n == 0){
        printf("a");
        return n;
    }
    if(n == 1){
        printf("b");
        return n;
    }
    if(ar[n]!=-1){
        return ar[n];
    }
    else{
        printf("c");
        ar[n] = sol(n-1,ar)+sol(n-2,ar);
        return ar[n];
    }
}
int main(){
    int dp[] = {-1,-1,-1,-1,-1};
    int n = 4;
    printf("%d",sol(n,dp));
}