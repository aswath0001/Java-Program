class Q8 {//array reverse using two pointers
public static void reverse (int []arr){
    int left =0;
    int right = arr.length-1;//tc=o(n) sc=o(1)
    while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
}
    public static void main(String[] args) {
          int [] arr ={1,2,4,4,7,8,11,12};
          reverse(arr);
          for(int x:arr){
            System.out.println(x+" ");
          }
    }
}