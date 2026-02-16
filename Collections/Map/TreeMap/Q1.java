package Collections.Map.TreeMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Q1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> A= new TreeMap<>();
        A.put(1,"aswath");
        A.put(2,"Abi");
        A.put(3,"Alwin");
        A.put(4,"pradeep");
        A.put(5,"guna");
        A.put(6,"guna");
        System.out.println(A);
        System.out.println(A.remove(1));
        System.out.println(A.firstEntry());
        System.out.println(A.lastEntry());
        System.out.println(A.higherKey(4));
        System.out.println(A.lowerEntry(3));
        System.out.println(A.ceilingKey(6));
        System.out.println(A.floorKey(6));
        for(int Key:A.keySet()){
            System.out.println(Key);
        }
        A.clear();
        System.out.println(A);
    }
}
