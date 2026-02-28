import java.util.Scanner;

class Q4 {//fibonacci
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first =0;
        int second = 1;

        System.out.print("the fibonacci series of first "+ n + " numbers are :");
        for (int i = 0; i <= n; i++) {
            System.out.print(first +" ");
           int sum = first + second;
            first = second;
            second = sum;
        }
        scan.close();
    }
}