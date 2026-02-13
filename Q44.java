import java.util.Scanner;
//palindrome
class Q44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String reversed ="";
        for (int i = original.length()-1; i>=0 ; i--) {
            reversed = reversed+original.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}