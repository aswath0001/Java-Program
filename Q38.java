
import java.util.Scanner;

class Q38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean result = true;
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                result = false;
                break;
            }
        }
        if(!result){
            System.out.println("not  prime number");
        }else {
            System.out.println("  prime number");
        }
    }
}