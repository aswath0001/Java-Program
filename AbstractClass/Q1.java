abstract class Shape {
    abstract void Draw();
}
class Circle extends Shape{
     void Draw(){
         System.out.println("Circle");
    }
}
class Square extends Shape{
    void Draw(){
        System.out.println("Square");
    }
}

class Q1 {
public static void main(String[] args) {
    Shape s1;
    s1=new Circle();
    s1.Draw();
    s1=new Square();
    s1.Draw();
}
}