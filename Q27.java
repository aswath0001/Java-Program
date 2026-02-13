class Q27 {
    public static void main(String[] args) {
       for (int i = 1; i <=5; i++) {
        System.out.println();
           for (int j = 5; j >=i; j--) {
               System.out.print(j);
           }
       } 
       for (int i = 4; i >=1; i--) {
        System.out.println();
           for (int j = 5; j >=i; j--) {
               System.out.print(j);
           }
       } 
    }
}/*
output
54321
5432
543
54
5
54
543
5432
54321
 */