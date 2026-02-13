
import java.util.Scanner;

class Q12 {// grade calculation
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.print("Enter the mark:");
        int mark = scan.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("Your grade is A");
        }else if(mark>=80 && mark<90){
            System.out.println("Your grade is B");
        }else if(mark>=70 && mark<80){
            System.out.println("Your grade is C");
        }else if(mark>=60&& mark<70){
            System.out.println("Your gade is D");
        }else if (mark >=50 && mark<60){
            System.out.println("Your grade is E");
        }else{
            System.out.println("Invalid mark");
        } 

    }
}