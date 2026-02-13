class Movie {
    String title;
    double rating;
    

    void compare(Movie m){
        if(this.rating >m.rating){
            System.out.println("The Movie "+this.title +" is better");
        }else {
             System.out.println("The Movie "+m.title +" is better");
        }
    }
}
class Q3 {
    public static void main(String[] args) {
        Movie M1 = new Movie();
        M1.title ="Durendar";
        M1.rating =9.8;

         Movie M2 = new Movie();
        M2.title ="Mara";
        M2.rating =7;
       
        M1.compare(M2);
        
    }
}