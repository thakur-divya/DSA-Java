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
    public static int binaryToDecimal(String b) {
        int dec = 0;
        for(int i=0;i<b.length();i++){
            dec = dec * 2 + (b.charAt(i) - '0');
        }
        return dec;
    }
    public static void main(String[] args) {
        bintodec(101101);
        System.out.println(binaryToDecimal("1111"));
    }
}
