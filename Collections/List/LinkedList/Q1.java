package Collections.List.LinkedList;

import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Aswath");
        name.add("Abi");
        name.add("Alwin");
        name.add("pradeep");
        name.add("guna");
        name.addFirst("Akil");
        name.addLast("akash");
        name.remove(2);
        name.remove("akhil");
        name.set(3,"ashok");
        System.out.println(name.getFirst());
        System.out.println(name.getLast());
        for(String i:name){
            System.out.println(i);
        }
        System.out.println(name.size());
        System.out.println(name.contains("jeya"));
    }
}
