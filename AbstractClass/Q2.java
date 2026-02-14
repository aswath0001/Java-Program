abstract class Animal {
    abstract void eat();
    void sound(){
    System.out.println("animal sounds");
}
}

class Lion extends Animal {
    void eat(){
        System.out.println("lion eats meat");
    }
    void sound(){
    System.out.println("Lion roars");
}
}

class Q2 {
    public static void main(String[] args) {
        Animal a;
        a = new Lion();
        a.eat();
        a.sound();
    }
}