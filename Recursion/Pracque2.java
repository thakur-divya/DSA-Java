public class Pracque2 {

    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void printno(int number){
        if(number == 0){
            return;
        }
        int last = number % 10;
        printno(number/10);
        System.out.print(digits[last] + " ");
    }
    public static void main(String[] args) {
        printno(120);
    }
}
