package Collections.Queue.PrirorityQueue;

import java.util.PriorityQueue;

public class Q1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> A = new PriorityQueue<>();
        A.add(12);
        A.add(1);
        A.add(34);
        A.add(30);
        A.add(15);
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
