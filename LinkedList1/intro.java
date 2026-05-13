public class intro{
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Methods to perform diff operations
    public void print(){
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void addFirst(int data){
        Node newNode = new Node(data); //step1 is to create a new node
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head; //step 2 is to assign newnode's next to head
        head = newNode; // Assign newNode as head
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        
    }

    public void addMiddle(int index, int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < (index - 1)){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        intro ll = new intro();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addMiddle(2, 10);
        ll.print();
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
    }
}