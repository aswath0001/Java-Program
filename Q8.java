import java.util.Scanner;//sum of digits of a number

class Q8{
    public static void main(String[] args) {
        int total =0;
        int temp =0;
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number:");
       int num = scan.nextInt();
       while (num>0) {
           temp = num%10;
           total = total+temp;
           num =num/10;
       }
       System.out.println(total);
    }
}