package queue;
//Circular Queue where remove time Comp is O(1) and starts from rear = -1 and front = -1
public class CircularQueue {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            size = n;
            arr = new int[n];
            rear = -1;
            front = -1;
        }
         public static boolean isEmpty(){
            return rear == -1;
         }
         public static boolean isFull(){
            return (rear+1) % size == front;
         }

         //Add in O(1)
         public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            //Since its circular queue
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;

         }
         //Remove in O(1)
         public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            //If we are deleting last element from the queue
            if(rear == front){
                rear = front = -1;
            }else{
            front = (front+1) % size;
            }
            return result;
         }
         //Peek in O(1)
         public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
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
