class Q2 {//small number
    public static void main(String[] args) {
         int[] array = {9,4,2,1,5,7};
        int min =array[0];
         for (int i = 1; i < array.length; i++) {
             if(array[i]<min){
                min=array[i];
             }
         }
         System.out.println("the smallest number in the array is :"+min);
    }
}