public class DecToBin {
    public static int dectobin(int n){    //Dec to base 2
        int rem = 0;
        int pow = 0;
        int decimal = 0;
        while(n > 0){
            rem = n % 2;
            decimal = decimal + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n /2;
        }
        return decimal;
    }


    //LeetCode ques 1017 Convert to base -2
    public static String baseNeg(int n){
        if(n == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int rem = n % -2;
            n = n/-2;

            //rem can only be either 0 or 1
            if(rem < 0){
                rem = rem + 2;
                n = n + 1;
            }

            sb.append(rem);
        }
        return sb.reverse().toString();
    }

    public static void main(String args[]){
        System.out.println(dectobin(9));
        System.out.println(baseNeg(9));
    }
}
