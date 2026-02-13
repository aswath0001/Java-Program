// sum of digits
import java.util.Scanner;

class Q46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum =0;
        int rem =0;
        while (num>0){
          rem = num%10;
          sum = sum+rem;
          num = num/10;
        }
        System.out.println(sum);
    }
}