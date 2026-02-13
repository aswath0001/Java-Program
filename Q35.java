import java.util.Scanner;

class InValidAgeException extends Exception{
public  InValidAgeException(String a){
    super(a);
}
}
class AgeValidator {
    void checkAge(int age){
try {
    if(age<0 || age>150){
        throw new InValidAgeException("invalid age");
    }
    else{
        System.err.println("valid age");
    }
} catch (Exception e) {
    System.out.println(e);
}
    }
}
class Q35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        AgeValidator A1 = new AgeValidator();
        A1.checkAge(a);
    }
}