class Q50 {
    public static void main(String[] args) {
        int num[] = {1,2,0,3,4,0};
        int index =0;
        for (int i = 0; i < num.length; i++) {
          if(num[i]!=0){
            num[index] = num[i];
            index++;
          }  
        }
        while(index<num.length){
            num[index]=0;
            index++;
        }
        for(int n: num){
            System.out.print(n + " ");
        }
    }
}