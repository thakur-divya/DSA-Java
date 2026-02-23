package BitManipulation;

public class getibit {
    public static void getithbit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            System.out.println("The ith bit is  0");
        }
        else{
            System.out.println("The ith bit is 1");
        }
    }
    public static void main(String[] args) {
        getithbit(9,2);
    }
}
