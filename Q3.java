class Q3 {//greatest of 2 numbers
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int Greatest =0;
        if(A>B){
            Greatest = A;
        } else if(B>A){
            Greatest = B;
        }else{
            System.err.println("Both are equal");
        }
        System.err.println(Greatest);
    }
}