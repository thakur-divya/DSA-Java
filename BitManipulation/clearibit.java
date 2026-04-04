package BitManipulation;

public class clearibit {
    public static int clearithbit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        //Clearing bit
        System.out.println(clearithbit(9,2));
    }
}
