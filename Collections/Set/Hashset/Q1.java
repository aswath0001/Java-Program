package Collections.Set.Hashset;

import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        HashSet<String> A = new HashSet<>();
        A.add("Aswath");
        A.add("Abi");
        A.add("Alwin");
        A.add("pradeep");
        A.add("guna");
        A.add("guna");
        A.remove("Alwin");
        A.contains("Abi");
        System.out.println("Contains Abi? " + A.contains("Abi"));
        System.out.println(A.size());
        for(String i:A){
            System.out.println(i);
        }
        A.clear();System.out.println(A);
    }
}
