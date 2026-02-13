
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = scan.nextInt();
        System.out.print("Enter number 2:");
        int b = scan.nextInt();
        int result = a>b ? a :b;
        System.out.println(result);
    }
}