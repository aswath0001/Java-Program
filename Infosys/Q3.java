
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static int minCoins(int coins[],int b){
     int [] c= new int[b+1];
     Arrays.fill(c, Integer.MAX_VALUE);
     c[0]=0;

     for (int i = 1; i <=b; i++) {
         for(int coin:coins){
        if(i - coin >= 0 && c[i - coin] != Integer.MAX_VALUE){
            c[i]=Math.min(c[i],1+c[i-coin]);
        }
         }
     }

    return c[b]==Integer.MAX_VALUE?-1:c[b];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b = scan.nextInt();

        int[] coins = new int[a];
        for (int i = 0; i < a; i++) {
           coins[i] = scan.nextInt(); 
        }

        int result = minCoins(coins, b);
        System.out.println(result);
    }
}