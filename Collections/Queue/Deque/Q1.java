package Collections.Queue.Deque;

import java.util.ArrayDeque;

public class Q1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.add(12);
        A.add(1);
        A.add(34);
        A.add(30);
        A.add(15);
        System.out.println(A);
        System.out.println(A.peekFirst());
        System.out.println(A.peekLast());
        System.out.println(A.removeFirst());
        System.out.println(A.removeLast());
        System.out.println(A.contains(6));
        System.out.println(A.size());
        for(int i:A){
            System.out.println(i);
        }
        A.clear();
        System.out.println(A);

    }
}
