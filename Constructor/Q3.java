class Book {
    String title;
    String author;
    int price;

    Book(String A, String B,int C){
    title = A;
    author =B;
    price = C;
    }
}
class Q3 {
    public static void main(String[] args) {
        Book B1 = new Book("Chess", "Viswanathan",230);
        Book B2 = new Book("Chess", "Viswanathan",240);
        Book B3 = new Book("Chess", "Viswanathan",250);
        Book max = B1;
        if(B2.price >max.price){
            max = B2;
        }
        if (B3.price>max.price) {
            max = B3;
        }
        System.out.println(max.price);
    }
}