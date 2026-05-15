package queue;
import java.util.*;

//Learning Implementation of Queue using Arrays
//Takes O(1) to add but O(n) to remove
public class usingArrays {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add takes O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        //remove takes O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){  //Bcz of this loop takes O(n)
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!Queue.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
