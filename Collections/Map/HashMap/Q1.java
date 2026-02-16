package Collections.Map.HashMap;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        HashMap<Integer,String>A = new HashMap<>();
        A.put(1,"aswath");
        A.put(2,"Abi");
        A.put(3,"Alwin");
        A.put(4,"pradeep");
        A.put(5,"guna");
        A.put(6,"guna");
        System.out.println(A);
        System.out.println(A.get(4));
        System.out.println(A.remove(2));
        System.out.println(A.containsKey(3));
        System.out.println(A.containsValue("aswath"));
        System.out.println(A.keySet());
        System.out.println(A.values());
        System.out.println(A.entrySet());
        A.clear();
        System.out.println(A);
    }
}
