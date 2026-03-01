import java.util.Arrays;
import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
       System.out.print("Enter the size of the array:");
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int arr [] = new int[size];
       System.out.print("Enter "+ size + " numbers:");
       for (int i = 0; i <size; i++) {
           arr[i] = scan.nextInt();
       }
       System.out.println("The original array is: "+ Arrays.toString(arr));

       for (int i = 0; i <arr.length/2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
         arr[arr.length-1-i] = temp;  
       }
       System.out.println("Reversed: "+ Arrays.toString(arr));
    }
}