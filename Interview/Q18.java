
import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
          System.err.print("Enter the number :");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            boolean isPrime = false;
            while(num>=2){
                for(int i =2; i<=num/2;i++){
                 isPrime = true;
                }
            }
            if(isPrime){
                System.out.println("prime number");
            }else {
                System.out.println("Not a prime number");
            }
    }
}