import java.util.Scanner;

class Q20 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the first number:");
       int a = scan.nextInt();
        System.out.print("Enter the first number:");
       int b = scan.nextInt();
       a=a>b ? a :b;
       b=a<b ? a:b;
       int r=0;
       while(a%b!=0){
       r=a%b;
       a=b;
       b=r;
       }
       System.out.println("The greatest common divisor is:"+r);
    }
}