class Q49 {//duplicate number
    public static void main(String[] args) {
        int num[] ={1,1,2,4,4,32,34,6,5,9,6};
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]==num[j]){
                    System.out.print(num[i]+" ");       
                }
            }
        }
    }
}