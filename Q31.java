class Vehicle {
    String brand;
    int year;

    void StartEngine (){
      System.out.println("vehicle starts");
    }
}
class Car extends Vehicle{
    String fuelType;
     void StartEngine (){
      System.out.println("Car starts");
    }
    void Drive (){
        System.out.println("car is driving");
    }
}
class Truck extends Vehicle{
    int loadCapacity;
     void StartEngine (){
      System.out.println("truck starts");
    }
    void Haul (){
        System.out.println("truck is hauling");
    }
}
class Q31 {
    public static void main(String[] args) {
        
    }
}