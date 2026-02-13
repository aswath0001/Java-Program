import java.util.Scanner;

class Q28 {
    void evenorodd (int num){
      if(num%2==0){
        System.out.println("even");
      }else {
        System.out.println("odd");
      }
    }
    public static void main(String[] args) {
        Q28 obj = new Q28();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        obj.evenorodd(num);
    }
}