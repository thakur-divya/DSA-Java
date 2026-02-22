package Strings;

public class compress {
    public static String comp(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            sb.append(ch);
            int count = 1;
            while(i < str.length()-1 && ch == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        String str = "aaaabbbcc";
        System.out.println(comp(str));
    }
}
