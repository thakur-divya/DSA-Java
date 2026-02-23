package BitManipulation;

public class setibit {
    public static int setithbit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setithbit(9,2));
    }
}
