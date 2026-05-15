package queue;

import java.util.*;
//Queue is an interface. it can be implemented using class like LinkedList and ArrayDeque

//ArrayDeque is mostly preferred bcz its faster,less memory overhead and cache friendly
public class usingJCF {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
