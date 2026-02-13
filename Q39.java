
import java.util.Scanner;

class Q39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fact=1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("the factorial of "+num+" is "+fact);
    }
}