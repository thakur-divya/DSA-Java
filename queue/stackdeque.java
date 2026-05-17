package queue;

import java.util.*;
//Implemet Stack Using Deque
public class stackdeque {
    static class Stack{
        Deque<Integer> d = new LinkedList<>();

        public void push(int data){
            d.addLast(data);
        }
        public int pop(){
            return d.removeLast();
        }
        public int peek(){
            return d.getLast();
        }
    }
    //Implementing Queue using Deque
    static class Queue{
        Deque<Integer> d = new LinkedList<>(); 
        
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek el " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(" ");

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
