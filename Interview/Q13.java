import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
             System.out.print("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int arr [] = new int[size];
        
        System.out.print("Enter the numbers: ");
       for (int i = 0; i <arr.length; i++) {
             arr[i] = scan.nextInt();
            }
      
    }
}