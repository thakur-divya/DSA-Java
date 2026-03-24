public class pracq3 {
    public static int len(String str){
        if(str.length() == 0){
            return -1;
        }

        return len(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "My Name is Divya";
        System.out.print(len(str));
    }
}
