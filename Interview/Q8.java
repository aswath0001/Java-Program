
import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word :");
        String Word = scan.nextLine();
        int vowels =0;
        int consonants = 0;
        char ans = ' ';
        for (int i = 0; i < Word.length(); i++) {
            ans = Word.charAt(i);
            if((ans >='a' && ans<='z') || (ans >= 'A' && ans <= 'Z')) {
            if(ans == 'a' || ans =='A'|| ans=='e' || ans =='E' || ans== 'i'|| ans =='I'|| ans =='o'|| ans=='O'||
             ans == 'u' || ans=='U' )
                {
               vowels ++;
            }else {
                consonants ++;
            }
        }
    }
        System.out.print("Vowels:"+ vowels);
        System.out.println("Consonants:"+ consonants);
        scan.close();
    }
}