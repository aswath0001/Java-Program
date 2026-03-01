import java.util.Arrays;

class Q6 {
    public static void main(String[] args) {
        int [] original ={1,2,3,5};
        int [] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
             reversed [i] = original[original.length-1-i];
        }
        System.out.println("original "+ Arrays.toString(original));
        System.out.println("reversed "+ Arrays.toString(reversed));
    }
}