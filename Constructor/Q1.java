class Car {
    String brand;
    int price;

    Car(String A,int B){
        brand = A;
        price = B;
    }
    void display() { 
        System.out.println(brand + " " + price);
     }
}

class Q1 {
    public static void main(String[] args) {
      Car c1 = new Car("Cadillac", 20000);
      c1.display();
    }
}