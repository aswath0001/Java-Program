
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


class Q4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b= scan.nextInt();

    List <List <Integer>> adj = new ArrayList<>();

    for (int i = 0; i <a; i++) {
        adj.add(new ArrayList<>());
    }
    for (int i = 0; i < b; i++) {
        int c=scan.nextInt();
        int d= scan.nextInt();

        adj.get(c).add(d);
        adj.get(d).add(c);
    }
    int[] dist = new int[a];
    Arrays.fill(dist, -1);

    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    dist[0]=0;
    while(!q.isEmpty()){
        int node = q.poll();
        for(int neighbor :adj.get(node)){
        if(dist[neighbor]==-1){
            dist[neighbor]= dist[node]+1;
            q.add(neighbor);
        }
    }
 
    }
    for(int e:dist){
   System.out.print(e+" ");
    }
    }
}