import java.util.Scanner;

class Q16 {// primes between range
    //50 ==> 2*2=4<50==>50%2=0
    //51 ==> 2*2=4<51==>51%2=!0==> 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number from:");
        int start = scan.nextInt();
         System.out.print("Enter the number to:");
        int to = scan.nextInt();
        for (int i = start; i <=to; i++) {
            boolean prime = true;
            for (int j = 2; j*j <= i; j++) {
             if(i%j==0){
            prime =false;
                }
            }
             if(prime && i > 1){
            System.err.println(i);
            }
        }
    }

}