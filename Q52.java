import java.util.Scanner;
// remove duplicate number from an array
class Q52 {
    public static void main(String[] args) {
             System.out.print("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int arr [] = new int[size];
        
        System.out.print("Enter the numbers: ");
       for (int i = 0; i <arr.length; i++) {
             arr[i] = scan.nextInt();
            }

     int visited = Integer.MIN_VALUE;

     for (int i = 0; i < arr.length; i++) {
         if(arr[i] != visited ){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i] = visited;
                }
            }
         }
     }
       System.out.print("after removing the duplicate numbers [");
       for (int i = 0; i <arr.length; i++) {
           if(arr[i] != visited){
              System.out.print(arr[i]);
              if(i<arr.length-1){
                for (int j = i+1; j < arr.length; j++) {
                     if(arr[j] != visited){
              System.out.print(", ");
              break;
                     }
                }
              }
           }
       }
        System.out.println("]");
        
        scan.close();
    }
}