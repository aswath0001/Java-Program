interface Vehicle {
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("car Starts");
    }
}
   class Bus implements Vehicle{
      public   void start(){
            System.out.println("Bus starts");
        }
    }
class Q2 {
    public static void main(String[] args) {
        Vehicle v1;
        v1 = new Car();
        v1.start();
        v1 = new Bus();
        v1.start();
    }
}