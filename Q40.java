class Q40 {//max in a array
    public static void main(String[] args) {
        int [] num = {1,2,42,54,12};
        int max =num [0];
       for (int i = 1; i < num.length; i++) {
           if(num[i] > max){
              max = num[i];
           }
       }
       System.out.println(max);
    }
}