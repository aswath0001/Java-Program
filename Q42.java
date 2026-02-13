class Q42 {
    //min in a array
    public static void main(String[] args) {
        int num [] ={21,2,32,43,54};
        int min =num [0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println(min);
    }
}