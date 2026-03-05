import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
         System.err.print("Enter the string to reverse:");
            Scanner scan = new Scanner(System.in);
            String original = scan.nextLine();
            String Reversed = " ";

            for(int i = original.length()-1;i>0;i--){
               Reversed = Reversed +original. charAt(i);
            }
            System.out.println(Reversed);
    }
}