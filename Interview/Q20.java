import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String reversed ="";

       for (int i = original.length()-1; i>=0; i--) {
           reversed = reversed+original.charAt(i);
       }
       if(reversed.equalsIgnoreCase(original)){
        System.out.println("Palindrome");
       }else{
        System.out.println("not a palindrome");
       }
    }
    
}
