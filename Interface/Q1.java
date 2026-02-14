interface Animal {
   void sound();
}
class Dog implements  Animal{
public void sound(){
    System.out.println("dog barks");
}
}
class Q1 {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.sound();
    }
}