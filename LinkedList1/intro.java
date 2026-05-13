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
    public static int size;

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
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head; //step 2 is to assign newnode's next to head
        head = newNode; // Assign newNode as head
    }

    public void addLast(int data){ //Add Node in Last of LL
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        
    }

    public void addMiddle(int index, int data){ //Add Node in the Middle of LL
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < (index - 1)){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){ //Remove First Node from LL
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){ //Remove Last node from LL
        if(size == 0){
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        //prev : i = size - 2
        Node prev = head;
        for(int i = 0; i < (size - 2); i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterative(int key){   //Iterative Searching Key element if not found return -1
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(key == temp.data){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){  //Helper function for recursive Search
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){ //Recursive Function search using helper function
        return helper(head,key);
    }

    public void reverse(){  //Reverse a LL 1->2->3->null to 3->2->1->null using iterative approach O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletenthfromEnd(int n){  //Remove Nth Node from the End CLASSICAL Que. asked 
        //Step 1 is to calculate size 
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){ //Agar ek hi node ho head to base case
            head = head.next;
        }

        Node prev = head;
        int i = 1;
        while(i < sz-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
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
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.iterative(10));
        System.out.println(ll.recSearch(3));

        ll.reverse();
        ll.print();

        ll.deletenthfromEnd(3);
        ll.print();
    }
}