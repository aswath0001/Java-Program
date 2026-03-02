
import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int arr [] = new int[size];
        int sum =0;
        
        System.out.print("Enter the numbers: ");
       for (int i = 0; i <arr.length; i++) {
             arr[i] = scan.nextInt();
            }

        for (int i = 0; i < arr.length; i++) {
            sum = sum+ arr[i];
        }

        System.out.println("The sum of array is : "+sum );
        scan.close();
       }
    }