package Collections.Map.LinkedhashMap;

import java.util.LinkedHashMap;

public class Q1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> A = new LinkedHashMap<>();
        A.put(1,"aswath");
        A.put(2,"Abi");
        A.put(3,"Alwin");
        A.put(4,"pradeep");
        A.put(5,"guna");
        A.put(6,"guna");
        System.out.println(A);
        System.out.println(A.remove(1));
        System.out.println(A.containsValue(2));
        System.out.println(A.containsKey(7));
        for(int Key:A.keySet()){
            System.out.println(Key);
        }
        A.clear();
        System.out.println(A);
    }
}
