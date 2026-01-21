package Functions;
public class BinToDec {
    public static void bintodec(int binNum){
        int pow=0;
        int dec = 0;

        while(binNum>0){
            int lastdigit = binNum % 10;
            dec = dec + lastdigit * (int)Math.pow(2,pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println("The result is : " + dec);
    }
    public static void main(String[] args) {
        bintodec(101101);
    }
}
