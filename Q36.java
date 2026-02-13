//string reverse
import java.util.Scanner;

class Q36 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       String original = scan.nextLine();
       String rev = "";
       for (int i = original.length()-1;i>=0;i--) {
           rev= rev+original.charAt(i);
       }
       System.out.println(rev);
    }
}