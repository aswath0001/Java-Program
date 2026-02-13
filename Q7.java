
import java.util.Scanner;

class Q7 {//count even and odd digits of a number
    public static void main(String[] args) {
       
       int Even=0;
       int Odd =0;
       int Rem =0;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number:");
       int num = scan.nextInt();
        
      while (num > 0)
         { 
          Rem = num % 10; 
          if (Rem % 2 == 0) 
            {
               Even++;

             } 
             else {
               Odd++;
               } 
               num = num / 10; 
              }
      System.err.println("Even digits:"+Even);
      System.err.println("Odd digits:"+Odd);
    
    }
    
}