package ArrayList;

import java.util.ArrayList;

//Reversing the ArrayList elements using list.size and list.get
public class Reverse {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //Reverse O(n)
        for(int i=list.size()-1 ;i >=0;i--){
            System.out.print(list.get(i) + " "); //list.get() to fetch elements of particular index
        }
        System.out.println("");
        
    }
}
