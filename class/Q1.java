class car {
    String Brand;
    int years;
    int price;

    void displayInfo(){
      System.out.println(Brand);
      System.out.println(years);
      System.out.println(price);
    }
}

class Q1 {

    public static void main(String[] args) {
       car c1 = new car();
       c1.Brand ="MINI";
       c1.years = 2024;
       c1.price = 208000;
       c1.displayInfo();
    }
}