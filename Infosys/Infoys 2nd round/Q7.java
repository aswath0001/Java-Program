class Q7 {//two pointer
     public static void hasPair (int [] arr,int target){ 
        int left=0;
        int right=arr.length-1;
         boolean found = false;
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Pair found:"+arr[right] + ","+arr[left]);
                found=true;
                left++;
                right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
         if(!found){
        System.out.println("No pair found");
    }
     }
    public static void main(String[] args) {
         int [] arr ={1,2,4,4,7,8,11,12};
        int target=8;
       hasPair(arr, target);
    }
}