//minimum coin change
#include<stdio.h>
int main(){
    int coins[] = {5,4,1,2};
    int n = sizeof(coins)/sizeof(coins[0]);
    int sum = 12;
    int dp[sum+1],max=1000;
    dp[0]=0;
    for(int i=1;i<=sum;i++){
        dp[i]=max;
    }
    for (int i=1;i<=sum;i++){
        for(int j=0;j<n;j++){
            if(coins[j]<=i){
                int r = i - coins[j];
                int min =1+dp[r];
                if(min<dp[i]){
                    dp[i]=min;
                }}}}
    for(int i=0;i<=sum;i++){
        printf("%d",dp[i]);
    }
}