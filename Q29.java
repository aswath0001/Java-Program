import java.util.Scanner;

class Q29 {
    String passorfail (int mark){
        if(mark>=35){
 return "pass";
        }
  else {
    return "fail";
  }
    }
    public static void main(String[] args) {
        Q29 obj = new Q29();
         Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        String result = obj.passorfail(mark);
        System.out.println(result);
    }
}