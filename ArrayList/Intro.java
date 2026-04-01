package ArrayList;
import java.util.ArrayList;
//Package to install ArrayList class
public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Adding an elemenet O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Takes O(n)
        list.add(0,9); //giving index and element

        System.out.println(list);

        //Getting an element O(1)
        int element = list.get(2);
        System.out.println(element); 
        System.out.println(list.get(4));  
        
        //Removing an element - O(n)
        list.remove(2); //Pass the index of element from list u want to remove
        System.out.println(list);

        //Set element at index O(n)
        list.set(2,10); //give index and element to set
        System.out.println(list);

        //Contains O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));



        //Size is not a property but a method to count the size of ArrayList
        System.out.println(list.size());

        //printing the ArrayList
        for(int i=0;i < list.size();i++){
            System.out.print(list.get(i));
        }
        System.err.println();
    }
}
