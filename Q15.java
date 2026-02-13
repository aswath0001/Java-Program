//prime number
import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int num = scan.nextInt();
        boolean result = false;
       for (int i = 2; i < num/2; i++) {
           if(num%i==0){
          result = true;
          break;
           }
       }
       if(result==true){
        System.out.println("not a prime");
       }else{
        System.out.println("prime number");
       }
    }
}