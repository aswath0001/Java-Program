
import java.util.Scanner;

class DivisonExample {
    void divideNumbers(int numerator,int denominator){
    try{
        int result = numerator/denominator;
        System.out.println(result);
    }
    catch(ArithmeticException e){
      System.out.println("cannot divide by zero");
    }
    }
}

class Q34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        DivisonExample obj = new DivisonExample();
        obj.divideNumbers(a, b);
    }
}