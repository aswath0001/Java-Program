class Q14 {//fixed sliding window
    public static int maxSum(int arr[],int K){
  int max=0;
  int windowSum=0;
  for (int i = 0; i < K; i++) {
      windowSum+=arr[i];
    
  }
  max=windowSum;
  for (int i = K; i < arr.length; i++) {
     windowSum = windowSum - arr[i - K] + arr[i];
     
      max=Math.max(max,windowSum);
  }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,2};
        int k =3;

        System.out.println("The maximum of subarray of size "+ k +" is:"+maxSum(arr, k));
    }
}