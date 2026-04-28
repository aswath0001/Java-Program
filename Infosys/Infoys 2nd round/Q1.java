class Q1 {
    //max in a array
    public static void main(String[] args) {
        int[] array = {1,4,2,1,5,7};
        int max =array[0];
        for (int i = 1; i <array.length; i++) {
            if(array[i]>max){
                max = array[i];// TC =o(n)  SC=o(1)
            }
        }
        System.out.println("the greatest number in the array is :"+max);
    }
}