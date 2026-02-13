// inheritance
class animal {
    String name;
    int age;

    void makesound() {
        System.out.println("animal makes sound");
    }
}

class Dog extends animal {
    String breed;

    void makesound() {
        System.out.println("dog barks");
    }

    void fetch() {
        System.out.println("dog is fetching");
    }
}

class Cat extends animal {
    String color;

    void makesound() {
        System.out.println("cat meows");
    }

    void climb() {
        System.out.println("cat climbs");
    }
}

public class Q30 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.age = 2;
        d1.name ="leo";
        d1.breed ="husky";
        d1.makesound();
        d1.fetch();

        Cat c1 = new Cat();
        c1.age =5;
        c1.name = "rio";
        c1.color = "brown";
        c1.makesound();
        c1.climb();
    }
}
