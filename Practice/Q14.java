
import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = scan.nextInt();
        if(year%4==0){
            if(year%100==0){
                 if(year%400==0){
                    System.out.println("Its a leap year");
                 }else {
                    System.out.println("Its not a leap year");
                 }
            }else{
                System.out.println("Its a leap year");
            }
        } else{
            System.err.println("Not a leap year");
        }
    }
}