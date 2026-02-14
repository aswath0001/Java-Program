class Shape {
    void area(){
        System.out.println("Area not defined");
    }
}
 class Circle extends Shape {
    int radius;
        void area(){
            System.out.println("area of a circle is "+ (3.14*radius*radius));
        }
    }
class Q3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius =30;
        c1.area();
        
    }
}