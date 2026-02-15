class Q3 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }finally{
            System.err.println("number cannot be divided by 0");
        }
    }
}