package Collections.List.ArrayList;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(121);
        list.add(1);
        list.add(123);
        list.remove(2);
       for(int n:list){
           System.out.println(n);
       }
    }
}
