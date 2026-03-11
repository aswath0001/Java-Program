import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number from:");
        int from = scan.nextInt();
        System.out.print("Enter the number to:");
        int to = scan.nextInt();
        System.out.print("The prime numbers from "+from +" to "+to+ " is :");
        for (int i = from; i <=to; i++) {
            boolean prime = true;
            for (int j = 2;  j*j<=i; j++) {
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(i>1 && prime){
                    System.out.print(i+" ");
                }
        }
    }
}