class Rectangle {
    int length;
    int breadth;
    int area (){
       return  length*breadth;
    }
}
class Q2 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.breadth = 22;
        R1.length =30;
        R1.area();

        Rectangle R2 = new Rectangle();
        R2.breadth = 27;
        R2.length =40;
        R2.area();

        if(R1.area() >= R2.area()){
            System.out.println("R1 is greater");
        }else {
            System.out.println("R2 is greater");
        }
    }
}