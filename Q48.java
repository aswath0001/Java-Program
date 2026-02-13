class Q48 {

    //reverse a array
    public static void main(String[] args) {
        int num [] ={1,2,3,4,5};
        int start =0;
        int end = num.length-1;
        while (end > start) { 
            int tem = num[start];
            num[start] = num[end];
            num[end] = tem;
            start++;
            end--;
        }
       
        for (int i = 0; i <=num.length-1; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
