import java.util.Scanner;
class MinimumSwapsEvenOrOdd{
    public static int minSwaps(int []arr){
      return Math.min(swapsEvenFirst(arr),swapsOddFirst(arr));
    }
    private static int swapsEvenFirst(int [] arr){
        int swaps=0;
        int evenIndex=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2==0){
                swaps+=Math.abs(i-evenIndex);
                evenIndex++;
            }
        }
        return swaps;
    }
    private static int swapsOddFirst (int [] arr){
    int swaps=0;
    int oddIndex=0;
    for (int i = 0; i <arr.length; i++) {
        if(arr[i]%2!=0){
            swaps+=Math.abs(i-oddIndex);
            oddIndex++;
        }
    }
    return swaps;
}
}

class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = scan.nextInt();
       
       int arr[] = new int[size];  
        System.out.print("Enter " + size + " elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        scan.close(); 
       int result = MinimumSwapsEvenOrOdd.minSwaps(arr);
        System.out.println("Minimum swaps required: " + result);
    }
}