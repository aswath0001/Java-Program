class Q22 {//array is sorted or not
    public static boolean isSorted (int arr[]){
        if(arr.length<=1){
            return true;
        }
       for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        int arr1 [] = {1,2,3,4,5};
        int arr2 []={9,5,2,1,4,8,10};

        boolean result1 = isSorted(arr1);
        boolean result2 = isSorted(arr2);

        System.out.println(result1);
        System.out.println(result2);
    }
}