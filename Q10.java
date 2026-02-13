
import java.util.Scanner;// number reverse

class Q10{
    public static void main(String[] args) {
        int rem =0;int result =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to reverse:");
        int num = scan.nextInt();
        // num = 12345 ==> rem = 12345%10 = 5 ==> result = 0*10+5 =5  ==>num = 12345/10 ==1234
        //num = 1234 ==> rem = 1234%10 = 4 ==> result = 5*10+4 =54  ==>num = 1234/10 ==123
        //num = 123 ==> rem = 123%10 = 54 ==> result = 54*10+3 =543  ==>num = 1234/10 ==12
       while(num>=1){
        rem = num%10;
        result = result*10+rem;
        num=num/10;
       }
System.out.println("The reversed number is:"+result);
    }
}