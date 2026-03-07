
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c= 0;
         Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();

      
        for (int i = 0; i <num; i++) {
            System.out.print(a);
            c=a+b;
            b=a;
             a=c;
           System.out.print(",");
        }
      
    }
}