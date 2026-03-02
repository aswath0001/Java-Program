import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
         System.out.print("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int arr [] = new int[size];
        
        System.out.print("Enter the numbers: ");
       for (int i = 0; i <arr.length; i++) {
             arr[i] = scan.nextInt();
            }
      
            int largest =arr[0];
            int secondLargest =Integer.MIN_VALUE;

            for (int i = 0; i <size; i++) {
                if(arr[i]>largest){
                 largest = arr[i];
                }
              }

                for (int i = 0; i <size; i++) {
                if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }

          }
             if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal)");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
        
        scan.close();
    }
}
