//factors of a number

import java.util.Scanner;

class Q18{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("the factors of "+num+" is:");
        for (int i = 1; i <= num/2; i++) {
            
            if(num%i==0){
               
               System.out.print(i);
               System.err.print(",");
            }
             
        }
    }
}