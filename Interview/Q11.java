import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
          System.out.print("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int arr [] = new int[size];
        
        
        System.out.print("Enter the numbers: ");
       for (int i = 0; i <arr.length; i++) {
             arr[i] = scan.nextInt();
            }
    
            boolean isSorted = true;

    for (int i = 1; i< arr.length; i++) {
        if(arr[i] < arr[i-1]){
            isSorted = false;
        }
    }  
    
     if (isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is NOT sorted in ascending order");
        }
        
        scan.close();
    }
}