
import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <=num/2; i++) {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
     if(isPrime){
        System.out.println("prime number");
     }else {
        System.out.println("Not a prime number");
     }
    }
}