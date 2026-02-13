class Vehicle{
String brand;
int price;
}
class Car extends  Vehicle {
 String fuelType;

 void display(){
    System.out.println("It is a "+brand +" it cost "+ price + " it is of fuel type "+fuelType);
 }
}
class Q2 {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.brand ="BMW";
        C1.fuelType="Petrol";
        C1.price = 4500000;

        C1.display();
    }
}