package queue;

import java.util.*;
//Doubly ended queue where opeartions can take place on either sides with predefined functions
public class deque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1); //1
        d.addFirst(2); // 2 1
        d.addLast(3); // 2 1 3
        d.addLast(4); // 2 1 3 4
        System.out.println(d);
        System.out.println("First el = " + d.getFirst()); //2
        d.removeFirst(); // 1 3 4
        d.removeLast(); // 1 3
        System.out.println("last el = " + d.getLast()); //3
        System.out.println(d); //1 3
    }
}
