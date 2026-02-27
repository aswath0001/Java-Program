
import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int res = 1;
        for (int i = A; i >0; i--) {
            res = res*i;
        }
       System.out.println("Factorial of " + A + " is: " + res);
    }
}