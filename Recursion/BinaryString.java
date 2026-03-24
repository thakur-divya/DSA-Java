public class BinaryString {
    public static void printstr(int n, int lastplace, String str){
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //Kaam
        if(lastplace == 0){
            printstr(n-1,0,str+"0");
            printstr(n-1,1,str+"1");
        }
        else{
            printstr(n-1,0,str+"0");
        }

    }
    public static void main(String[] args) {
        printstr(3,0,"");
    }
}
