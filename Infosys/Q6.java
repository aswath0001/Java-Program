
import java.util.HashMap;

class Solution1 {
public int subarraySum1 (int num[],int k ){
    HashMap < Integer ,Integer> map = new HashMap<>();
    int count =0;
    int sum=0;
    map.put(0, 1);
    for(int i=0;i<num.length;i++){
        sum+=num[i];
        int rem = sum%k;
        if(rem<0){
            rem+=k;
        }
        if(map.containsKey(rem)){
            count+=map.get(rem);
        }    
        map.put(rem, map.getOrDefault(rem, 0)+1);
    }
return count;
}
}
class Q6 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int k=5;
        int num[] = {4,5,0,-2,-3,1};
        System.out.println("The answer is:"+ sol.subarraySum1(num, k));
    }
}