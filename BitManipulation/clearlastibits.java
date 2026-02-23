package BitManipulation;

public class clearlastibits {
    public static int clear(int n,int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear(15,2));
    }
}
