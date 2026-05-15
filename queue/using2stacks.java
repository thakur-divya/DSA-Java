package queue;
import java.util.*;
//Queue using 2 stacks
/*Two method is there in first add is O(n) and rest O(1)
while in second remove pop is O(n) and rest is O(1) */
public class using2stacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add - O(n)
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove - O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        //peek - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
