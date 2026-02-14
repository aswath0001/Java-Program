interface A {
    void show();
}
interface  B {
    void display();
}

class Test implements A,B {
  public  void show (){
    System.out.println("show");
   }
   public  void display (){
    System.out.println("display");
   }
}
class Q3 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
        t1.show();
    }
}