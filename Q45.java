
import java.util.Scanner;

class Q45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int vowel = 0;
        char v =' ';
        for (int i = 0; i < s.length(); i++) {
            v = s.charAt(i);
            if(v== 'a' ||v=='A'|| v== 'e'|| v=='E'|| v== 'i'|| v=='I'|| v=='o'|| v=='O'|| v=='u'|| v=='U' ){
              vowel++;
            }
        }
        System.out.println(vowel);
    }
}