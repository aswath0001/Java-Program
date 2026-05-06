
import java.util.HashMap;
import java.util.Map;

class Q21 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cn = nums[i];
            int need=target-cn;
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(cn,i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        int res[] = twoSum(nums,target);
         System.out.println("Indices: [" + res[0] + ", " + res[1] + "]");
    }
}//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.