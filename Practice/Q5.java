
import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp =0;

        for(int i=1;i<=5;i++){
            System.out.print("Enter the number :");
            int a = scan.nextInt();
            
            if(a>temp){
                temp=a;
            }
        }
        System.out.println("the greatest number is :"+temp);
    }
}