class Q5 {//second smallest number
     public static void main(String[] args) {
         int num[] = {21,32,321,33,67};
         int min = Integer.MAX_VALUE;
         int secondMin=Integer.MAX_VALUE;
         for (int i = 0; i < num.length; i++) {
             if(num[i]<min){
                secondMin=min;
                min=num[i];
             }
             else if(num[i]>min && num[i]<secondMin){
                secondMin=num[i];
             }
         }
         System.out.println("The second minimum number is :"+secondMin);
     }
}