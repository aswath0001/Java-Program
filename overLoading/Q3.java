class Area {
    double area(int side){
        return  side*side;
    }  
     double area(int length, int width){
        return  length*width;
     }  
      double area(double radius){
        return  3.14*radius*radius;
      }
}


class Q3 {
    
    public static void main(String[] args) {
        Area a1 = new Area();
       ;
        System.out.println( a1.area(2));  
        System.out.println( a1.area(22,34));
        System.out.println(a1.area(12.0));
    }
}