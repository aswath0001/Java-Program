package Collections.Set.LinkedHashset;

import java.util.LinkedHashSet;

public class Q1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> A = new LinkedHashSet<>();
        A.add(1);
        A.add(2);
        A.add(4);
        A.add(3);
        A.add(5);
        System.out.println(A.add(3));
        System.out.println(A.remove(1));
        System.out.println(A.contains(3));
        System.out.println(A.size());
        for(int i:A){
            System.out.println(i);
        }
      A.clear();
        System.out.println(A);
    }
}
