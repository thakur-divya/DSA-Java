public class duplicate {
    //Program to find duplicates of strings in an array using recursion
    public static void remove(String str,int idx,StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            remove(str,idx+1,newStr,map);
        }
        else{
            map[currChar - 'a'] = true;
            remove(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        remove(str,0,new StringBuilder(""),new boolean[26]);
    }
}
