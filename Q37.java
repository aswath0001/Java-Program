
import java.util.Scanner;

class Q37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result =0;
        int original = num;
        int rev = 0;
        while (num>0){
          rev = num%10;
          result = result*10+rev;
          num = num/10;
        }
        if(result==original){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palin");
        }
    }
}