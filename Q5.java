
import java.util.Scanner;
class Q5{//greatest of N numbers
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int temp =0;
       
        int num ;
       for (int i = 1; i < 5; i++) {
           System.out.print("Enter a number:");
        num = scan.nextInt(); 
        if(num>temp){
            temp =num;
        }
       }
        
      System.out.println("the greatest number is :"+temp);
    }
}