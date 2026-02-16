package Collections.Queue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> A = new LinkedList<>();
        A.add(1);
        A.add(2);
        A.add(4);
        A.add(3);
        A.add(5);
        System.out.println(A);
        System.out.println(A.poll());
        System.out.println(A.peek());
        System.out.println(A.contains(6));
        System.out.println(A.size());
        for(int i:A){
            System.out.println(i);
        }
        A.clear();
        System.out.println(A);
    }
}
