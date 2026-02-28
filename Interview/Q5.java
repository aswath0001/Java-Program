
import java.util.Scanner;

class  Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isprime = true;
        if(num<2){
            isprime = false;
        }else {

        for (int i = 2; i <=num/2; i++) {
            if(num%i==0){
              isprime = false;
              break;
            }
        }
    }
        if(isprime){
            System.out.println("is a prime");
        }else {
            System.out.println("not a Prime");
        }
        scan.close();
    }
}