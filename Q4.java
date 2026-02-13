public class Q4 {//greatest of 3 numbers

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 4;
        if(a>b && a>c){
            System.out.println("A is the greatest number");
        }
        else if(b>a && b>c){
            System.out.println("B is the greatest number");
        }
       else  if(c>b && c>a){
            System.out.println("C is the greatest number");
        }
    }
}