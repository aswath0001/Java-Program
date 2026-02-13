class Laptop {
   String brand;
   int ram;
   double price;
   
   void laptop(){
    System.out.println(brand +" "+price+" "+ram);
   }
}
class Q1 {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.brand ="HCL";
        L1.price =20000;
        L1.ram =16;
        L1.laptop();

        Laptop L2 = new Laptop();
        L2.brand ="DELL";
        L2.price =100000;
        L2.ram =32;
        L2.laptop();
       
    }
}