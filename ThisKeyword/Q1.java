class Car {
    String brand;
    int price;
    Car(String brand, int price){
       this.brand =brand;
       this.price=price; 
    }
    void display(){
        System.out.println(brand);
        System.out.println(price);
    }
}
class Q1 {
    public static void main(String[] args) {
        Car c = new Car("BMw", 200000);
        c.display();
    }
}