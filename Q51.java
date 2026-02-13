class Q51 {
    //missing number in a array
    public static void main(String[] args) {
        int num [] ={1,3,4,5};
        int n = num.length+1;//
        int expected = n*(n+1)/2;
        int actual =0;
        for(int K :num){
            actual += K;
        }
        int missing = expected-actual;
        System.out.println(missing);

    }
}