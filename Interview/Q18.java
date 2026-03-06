
import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
          System.err.print("Enter the number :");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            boolean isPrime = true;
            if(num<2){
                isPrime = false;
            }else {
                for(int i =2; i<=num/2;i++){
                if(num%i==0){
                     isPrime = false;
                }
                }
    }
            if(isPrime){
                System.out.println("prime number");
            }else {
                System.out.println("Not a prime number");
            }
    }
}