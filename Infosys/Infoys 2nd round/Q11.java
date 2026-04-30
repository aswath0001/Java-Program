class Q11 {//zeros on one side
    public static void moveZeros (int arr[]){
     int i=0;
     for (int j = 0; j < arr.length; j++) {
         if(arr[j]!=0){
          int temp=arr[i];
          arr[i]=arr[j];
           arr[j]=temp;
           i++;
         }
     }
    }
    public static void main(String[] args) {
        int [] arr ={1,2,4,4,0,8,0,12};
        moveZeros(arr);
        for(int x:arr){//tc o(n) sc=o(1)
            System.out.println(x +" ");
        }
    }
}