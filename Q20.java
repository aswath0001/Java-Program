import java.util.Scanner;
//GCD
class Q20{
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1:");//36
        int num1 = scan.nextInt();
        System.out.print("Enter number 2:");
        int num2 = scan.nextInt();//60
       int r=0;
    int a = num1>num2 ? num1 :num2;// ==60
    int b =  num1< num2 ? num1 :num2;//==36
    while(a%b!=0){// 60%36!=0;    //36%24!=0;    // 24%12==0
        r=a%b;//24   //12
        a=b;//36    //24
        b=r;//24    //12
    }
    System.out.println(r); //12
    }
}