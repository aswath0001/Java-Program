class Q9 {//array reverse using two pointers
public static String reverse (String str){
    char[] arr = str.toCharArray();
    int left =0;
    int right = arr.length-1;//tc=o(n) sc=o(1)
    while(left<right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
    return new String(arr);
}
    public static void main(String[] args) {
          String str ="aswath";
          reverse(str);
         String result=reverse(str);
         System.out.println(result);
    }
}