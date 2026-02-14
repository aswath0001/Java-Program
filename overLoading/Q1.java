class Calculator {
    void add(int a, int b){
          System.out.println(a+b);
    }
    void add(int a,int b, int c){
  System.out.println(a+b+c);
    }
    void add(double a, double b){
      System.out.println(a+b);
    }
}


class Q1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(2,4 );
        c1.add(2.5, 2);
        c1.add(1, 2, 3);
    }
}