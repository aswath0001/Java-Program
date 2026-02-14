abstract class Vehicle {
     Vehicle(){
          System.out.println("Ots a vehicle");
    }
}
class Bike extends Vehicle {
    void run (){
        System.out.println("bike runs");
    }
}

class Q3 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}