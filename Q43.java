class Q43 {
    //second smallest
    public static void main(String[] args) {
        int num[] ={21,43,22,34,78};
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i]< min){
                secondmin = min;
                min = num[i];
            }else if (num[i]>min && num[i]<secondmin) {
                secondmin = num[i];
            }
        }
        System.out.println(secondmin);
    }
}