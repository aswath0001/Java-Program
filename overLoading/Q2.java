class Display {
    void show(int a){
          System.out.println(a);
    }
    void show(int a, String b){
          System.out.println(a +" "+b);
    }
    void show(String a){
        System.out.println(a);
    }

}
class Q2 {
    public static void main(String[] args) {
        Display d1 = new Display();
        d1.show(1);
        d1.show("aswath");
        d1.show(1, "aswath");
    }
}