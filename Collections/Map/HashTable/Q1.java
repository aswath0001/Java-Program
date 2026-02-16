package Collections.Map.HashTable;

import java.util.Hashtable;

public class Q1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> A = new Hashtable<>();
        A.put(1,"aswath");
        A.put(2,"Abi");
        A.put(3,"Alwin");
        A.put(4,"pradeep");
        A.put(5,"guna");
        A.put(6,"guna");
        System.out.println(A);
        System.out.println(A.remove(2));
        System.out.println(A.containsValue("ram"));
        System.out.println(A.containsKey(3));
        for(int Key : A.keySet()){
            System.out.println(Key);
        }
        A.put(null,"rahul");
        System.out.println(A);
    }
}
