class Q11 {// fibonacci series
    public static void main(String[] args) {
       int a =0;
       int b=1;
       int result =0;
       for (int i = 1; i <=8; i++) {
        System.out.print(a+",");
           result = a+b;
           a=b;
           b=result;
       } 
      
    }
}