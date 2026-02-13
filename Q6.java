import java.util.Scanner;

class Q6{// count even and odd numbers in a set of numbers
    public static void main(String[] args) {
        int Even = 0;
        int Odd = 0;
        Scanner scan = new Scanner(System.in);
        for(int i =1;i<=5;i++){
         System.out.print("Enter the number"+i+":");
         int num = scan.nextInt();
         if(num%2==0){
            Even=Even+1;
         }
          if(num%2 !=0){
            Odd=Odd+1;
         }
        }
        System.out.println("Odd count is "+Odd);
        System.out.println("Even count is "+Even);
    }
}