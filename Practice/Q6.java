
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
       
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the number :");
            int num = scan.nextInt();
            if(num%2==0){
                even=even+1;
            }
            if(num%2!=0){
                odd=odd+1;
            }
        }
       
        System.out.println("Even count:"+even);
        System.out.println("Odd count:"+odd);

         scan.close();
    }
}