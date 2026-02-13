class Shape {
    void area(){
        System.out.println("Area not defined");
    }
}
 class Circle extends Shape {
        void area(){
            System.out.println("its a Circle");
        }
    }
class Q3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
    }
}