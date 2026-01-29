import java.util.*;


public class Arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        System.out.println("length of arrays is : " + marks.length);
        System.out.println("Enter 3 subjects marks  : ");
         marks[0]=sc.nextInt();//phy
         marks[1]=sc.nextInt();//chem
         marks[2]=sc.nextInt();//maths

         System.out.println("phy : " + marks[0]);
         System.out.println("chem : " + marks[1]);
         System.out.println("maths : " + marks[2]);

    }
}
