public class pracq4 {
    public static int printno(String str){
        if (str.length() == 1) {
            return 1;
        }
        int newstr = printno(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(printno(str));
    }
}
