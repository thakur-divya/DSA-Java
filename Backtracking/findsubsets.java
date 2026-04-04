package Backtracking;

public class findsubsets {
    public static void findsubs(String str, String ans,int i){
        //base case
        if(i == str.length()){
            if(str.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(str);
            }
            return;
        }
            //recursion
            //if choice is yes
            findsubs(str, ans+str.charAt(i),i+1);
            //if choice is no
            findsubs(str,ans,i+1);
        }
    //Main method
    public static void main(String[] args) {
        String str = "abc";
        findsubs(str,"",0);
    }
}
