
import java.util.HashSet;
import java.util.Set;

class Q19 {//longest substring
    public static int longestSubString(String s){
      Set<Character> set = new HashSet<>();
      int left=0;
      int max=0;
      for (int right = 0; right < s.length(); right++) {
          while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left)); 
            left++;
          }
          set.add(s.charAt(right));
          max=Math.max(right-left+1, max);
      }
             return  max;
    }
public static void main(String[] args) {
    String s="abcabcbb";
    int res = longestSubString(s);
    System.out.println(res);
}
}