class Robber1 {
public int rob(int [] num){
int n=num.length;
if(n==1) return num[0];
int skipFirst[] = new int[n-1];
int skipLast [] = new int[n-1];
for (int i = 0; i < n-1; i++) {
    skipFirst[i]=num[i+1];
    skipLast[i]=num[i];
}
int res1= robHelper(skipFirst);
int res2= robHelper(skipLast);
return Math.max(res1, res2);

}//tc=o(n) ;sc=o(n)
public int robHelper(int arr[]){
    int n=arr.length;
if(n==1) return arr[0];
int dp[] = new int[n+1];
dp[0]=0;
dp[1]=arr[0];
for (int i = 2; i < n+1; i++) {
    int steal =arr[i-1]+dp[i-2];
    int skip =dp[i-1];
    dp[i]=Math.max(steal, skip);
}
return dp[n];
}
}
class Q8 {
    public static void main(String[] args) {
        int num [] = {2,3,2};
       Robber1 R1 = new Robber1();
       System.out.println("The maximum robbed is:"+ R1.rob(num));
    }
}