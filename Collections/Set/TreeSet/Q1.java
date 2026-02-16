package Collections.Set.TreeSet;

import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(12);
        tree.add(120);
        tree.add(12);
        tree.add(12);
        tree.add(2);
        tree.add(20);
        tree.add(1);
        System.out.println(tree.add(1));
        System.out.println(tree.remove(120));
        System.out.println(tree.contains(1));
        System.out.println(tree.size());
        System.out.println(tree.size());
        for(Object i: tree){
            System.out.println(i);
        }

    }
}
