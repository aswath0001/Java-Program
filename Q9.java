
import java.util.Scanner;

class Q9{//binary to decimal number
    public static void main(String[] args) {
       double temp =0; int rem = 0; double product;int i =0;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter binary number:");
       int num = scan.nextInt();
      //num =1110  => rem=1110%10 =0 ==> product = 0*Math.pow(2, 0) =0 ==> temp = 0+0 =0  ==> num = num/10 = 111 ==> i =1
     //num =111  => rem=111%10 =1 ==> product = 1*Math.pow(2, 1) =2 ==> temp = 0+2 =2   ==> num = num/10 = 11 ==> i =2
     //num =11  => rem=11%10 =1 ==> product = 1*Math.pow(2, 2) =4 ==> temp = 2+4 =6  ==> num = num/10 = 1 ==> i =3
     //num =1  => rem=1%10 =1 ==> product = 1*Math.pow(2, 3) =8 ==> temp = 6+8 =14
      while (num>0) {
           rem = num%10;
           product = rem*Math.pow(2, i);
           temp = temp+product;
           num =num/10;
          i++;
       }
       int result = (int)temp;
       System.out.println("the decimal number for the binary digit is:"+result);
    }
}