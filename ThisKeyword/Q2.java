class Box {
    Box(){
        System.out.println("this is a box");
    }
    Box(int a){
        this();
        System.out.println(a);
    }
}

class Q2 {

    public static void main(String[] args) {
        Box b1 ;
        b1= new Box();
        b1=new Box(22);
    }
}