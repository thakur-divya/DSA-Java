package queue;
//implementation of Queue using Linked list asked in Microsoft
public class usingLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){ //No need of isFull Method bcz LL is dynamic in size not fixed like arrays
            return head == null && tail == null;
        } 

        //Add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){      //if no element
                System.out.println("LL is Empty");
                return -1;
            }

            int front = head.data;
            if(tail == head){    //if single element is there in LL
                head = tail = null;
            }else{
            head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("LL is Empty");
                return -1;
            }
            return head.data;
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
