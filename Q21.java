import java.util.Scanner;
//LCM
class Q21 {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2:");
        int num2 = scan.nextInt();
        int max;
    int a = num1>num2 ? num1 :num2;
    int b =  num1< num2 ? num1 :num2;
    max=a;
  do{
    if (max%a==0 && max%b==0)
     {
        System.out.println("LCM is :"+max);
    break;
    }else{
        max++;
    }
}while(true);
}
}