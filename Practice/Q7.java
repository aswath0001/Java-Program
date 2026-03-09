import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int num= scan.nextInt();

         int odd=0;
         int even=0;
         int rem=0;

         while(num>0){
            rem=num%10;
            if(rem%2==0){
                even=even+1;
            }else{
                  odd=odd+1;
            }
            num=num/10;
         }
         System.err.println("Odd:"+odd);
         System.out.println("Even:"+even);
    }
}