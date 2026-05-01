class Q13 {//prefix sum
    public static void pairSum(int arr[]){
      int arr2[]=new int[arr.length];
      arr2[0]=arr[0];
      for (int i = 1; i < arr.length; i++) {
          arr2[i]=arr2[i-1]+arr[i];
      }
      for (int i = 0; i <arr.length; i++) {
          System.out.println(arr2[i]+" ");
      }
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,10,20};
     pairSum(arr);
    }
}