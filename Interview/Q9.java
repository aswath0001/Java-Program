import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
         System.out.print("Enter the size of the array:");
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int arr [] = new int[size];
      
       System.out.print("Enter "+ size + " numbers:");
       for (int i = 0; i <size; i++) {
           arr[i] = scan.nextInt();
       }

        int Greatest = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if(arr[i]> Greatest){
            Greatest = arr[i];
        }
    }
    
    System.out.println("The greatest number is "+ Greatest);
    }
}