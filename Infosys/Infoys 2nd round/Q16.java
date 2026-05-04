
import java.util.HashSet;
import java.util.Set;

class Q16 {
    public static int minSubArray(int arr[]){
        int left=0;
        int minLen=Integer.MAX_VALUE;
        Set<Integer> set=new HashSet<>();
        for (int right = 0; right < arr.length; right++) {
            while(set.contains(arr[right])){
             minLen=Math.min(minLen, right-left+1);
             set.remove(arr[left]);
             left++;
            }
            set.add(arr[right]);
        }
        return (minLen==Integer.MAX_VALUE)?-1:minLen;
    }
    public static void main(String[] args) {
        int arr[] ={4,3,5,3,2,1};
        int res = minSubArray(arr);
        System.out.println(res);
    }
}