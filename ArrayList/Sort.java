package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    //Collections ek class hai aur Collection ek interface hai

    //Collections class ka Sort method call krenge jiske andar wo Ascending order me aayega
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(89);
        list.add(7);
        list.add(34);
        list.add(10);
        list.add(9);

        System.out.println(list);
        Collections.sort(list); //by default in asc order
        System.out.println(list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        //Comparator ek function hota hai jo Sorting ka logic define karta hai java me
        System.out.println(list);
    }
}
