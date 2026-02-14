class Animal {
    void sound(){
        System.out.println("animal sound");
    }
}
class Dog extends Animal{
     void sound(){
        super.sound();
        System.out.println("dog barks");
    }
}
class Q1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}