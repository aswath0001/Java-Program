//perfect number
import java.util.Scanner;

class  Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        for (int i = 1; i <=num/2; i++) {
            if(num%i==0){
            sum=sum+i;
            }
        }
       if(num==sum){
            System.out.println("perfect number");
        }else{
           System.out.println("not a perfect number"); 
        }
    }
}