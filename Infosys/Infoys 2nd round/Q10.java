class Q10 {//remove duplicate two pointer
    public static int removeDuplicate(int[] arr){
        if(arr.length==0){
            return 0;
        }
       int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
              i++;
              arr[i]=arr[j];
            }

            
        }
        return i+1;
    }
    public static void main(String[] args) {
         int [] arr ={1,2,4,4,7,8,11,12};
         int newLength = removeDuplicate(arr);
     for (int i = 0; i < newLength; i++) {
         System.out.print(arr[i]+" ");
     }
    }
}