import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
         System.err.print("Enter the string :");
            Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
            boolean isVowels = false;

            for (int i = 0; i <string.length(); i++) {
                if (string.charAt(i)== 'a' || string.charAt(i)== 'A' || string.charAt(i)== 'e' || string.charAt(i)== 'E' || 
            string.charAt(i)== 'i' || string.charAt(i)== 'I' ||string.charAt(i)== 'o' ||  string.charAt(i)== 'O' ||
        string.charAt(i)== 'u' || string.charAt(i)== 'U'    ) {
                    isVowels = true;
                    break;
                }

            }
            if(isVowels){
                System.out.println("String contains vowels");
            }else {
                  System.out.println("String contains no vowels");
            }
    }
}