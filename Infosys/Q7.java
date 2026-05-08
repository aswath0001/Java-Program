class Robber {
public int rob(int [] num){
int n=num.length;
if(n==1) return num[0];
int dp[] = new int[n+1];
dp[0]=0;
dp[1]=num[0];
for (int i = 2; i < n+1; i++) {
    int steal =num[i-1]+dp[i-2];
    int skip =dp[i-1];
    dp[i]=Math.max(steal, skip);
}
return dp[n];
}//tc=o(n) ;sc=o(n)
}
class Q7 {
    public static void main(String[] args) {
        int num [] = {1,2,3,1};
       Robber R1 = new Robber();
       System.out.println("The maximum robbed is:"+ R1.rob(num));
    }
}