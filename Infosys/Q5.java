import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

class Q5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example 1: nums = [1,1,1], k = 2 → Output: 2
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Test 1: " + sol.subarraySum(nums1, k1));
        
        // Example 2: nums = [1,2,3], k = 3 → Output: 2
        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println("Test 2: " + sol.subarraySum(nums2, k2));
        
        // Test with negative numbers
        int[] nums3 = {1, -1, 0};
        int k3 = 0;
        System.out.println("Test 3: " + sol.subarraySum(nums3, k3));
    }
}