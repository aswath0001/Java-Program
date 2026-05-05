class Q18 {//kadane algm 
    public static int kadane (int []arr){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int num:arr){
           cs+=num;
           if(cs>ms){
            ms=cs;
           }
           if(cs<0){
            cs=0;
           }
        }
        return ms;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = kadane(arr);
        System.out.println(result);
    }
}