import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = "";
        for (int i =  A.length()-1; i >=0; i--) {
            B = B+A.charAt(i);
        }
   if(A.equals(B)){
    System.out.println(A + " is a palindrome");
   }else {
    System.out.println(A +" is not a palindrome");
   }
    }
}