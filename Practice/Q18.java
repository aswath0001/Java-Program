import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check its factors:");
        int num = scan.nextInt();
        System.out.print("The factors of the number "+num+" are :");
        for (int i = 1; i <=num/2; i++) {
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        System.out.print(num);
    }
}