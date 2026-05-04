import java.util.HashMap;
import java.util.Map;

class Q17 {
    public static int subArraySum(int arr[],int k){
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int num:arr){
            sum+=num;
            if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
        }
         map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
       
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
       int  k=3;
       int result=subArraySum(arr,k);
       System.out.println(result);
    }
}