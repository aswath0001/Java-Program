import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        try{
            a =a/0;
        }catch(ArithmeticException e){
                System.out.println("cannot divide by zero");
        }
    }
}