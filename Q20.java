import java.util.Scanner;

class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scan.nextInt();
        System.out.print("Enter the second number: ");
        int b = scan.nextInt();
        
        int originalA = a;//30
        int originalB = b;//40
        
        // Euclidean algorithm works even if a < b
        // The first iteration will swap them automatically
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        System.out.println("GCD of " + originalA + " and " + originalB + " = " + a);
        
        scan.close();
    }
}