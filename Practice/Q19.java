
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner scan=  new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = scan.nextInt();
         System.out.print("Enter the second number:");
        int b = scan.nextInt();
        int result=a>b ? a :b;
        System.out.println("The greatest number is "+result);
    }
}