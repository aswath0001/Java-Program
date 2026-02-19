class Q41 {
    //second maximum number
    public static void main(String[] args) {
        int num[] = {21,32,321,33,67};
        int max = num[0];
        int secondMax = num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]>max){
                secondMax = max;
                max =num[i];

            }else if(num[i]<max && num[i] >secondMax){
                secondMax= num[i];
            }
        }
        System.out.println("Second maximum number is: " + secondMax);
    }
}