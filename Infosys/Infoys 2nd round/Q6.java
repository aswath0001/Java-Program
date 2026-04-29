class Q6 {//brute force
    public static void hasPair (int [] arr,int target){
        boolean res = true;//tc = o(n2)
         for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair found:"+arr[i]+", "+arr[j]);
                    res=true;
                }
            }
             if (!res) {
        System.out.println("No pair found");
    }
        }
   
    }
    public static void main(String[] args) {
        int [] arr ={1,2,4,4,7,8,11,12};
        int target=8;
       hasPair(arr, target);
    }
}