import java.util.Scanner;

class Q10{
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
         int num= scan.nextInt();
         int rem=0;
         int reversed=0;

         while(num>0){
            rem = num%10;
            reversed = reversed*10+rem;
            num=num/10;
         }
         System.out.println("The revrsed numbers are"+reversed);
    }
}