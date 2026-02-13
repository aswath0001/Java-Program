
import java.util.Scanner;
//simple calculator
class Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = scan.nextInt();
        System.out.print("Enter number 2:");
        int b= scan.nextInt();
        System.out.print("Enter operator:");
        char c = scan.next().charAt(0);

        switch (c) {
            case '+' :
                System.out.println(a+b);
                break;
             case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
           
        }
    }
}