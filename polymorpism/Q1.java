class Shape {
    void  draw(){
           System.out.println("shape");
     }
}
class Circle extends Shape {
void draw(){
    System.out.println("circle");
}

}
class Square extends Shape {
    void draw(){
        System.out.println("Square");
    }
}

class Q1 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s=new Square();
        s.draw();
    }
}