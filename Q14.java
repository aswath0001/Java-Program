import java.util.Scanner;
//leap year or not
class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = scan.nextInt();//2000
       if(year%4==0){//true
          if(year%100==0){//true
           if(year%400==0){//true
            System.out.println("its a leap year");
           }  else{
              System.out.println("not a leap year");
           }  
          }else{
              System.out.println("its a leap year");
           } 
       }
        else{
            System.err.println("Not a leap year");
        }
    }
}