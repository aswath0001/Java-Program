
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Q2 {
    public static int countDistinctSubString(String s, int k){
        Set <String> set = new HashSet<>();
        for (int i = 0; i <s.length(); i++) {
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0)+1);

                if(map.size()==k){
                    set.add(s.substring(i,j+1));
                }else if(map.size()>k) {
                   break;
                }
            }
        }
        return set.size() ;
    }
    public static void main(String[] args) {
       String s = "abcbaa";
       int k=3;
       System.out.println(countDistinctSubString(s, k));
    }
}