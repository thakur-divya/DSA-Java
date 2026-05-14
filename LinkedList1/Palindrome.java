public class Palindrome {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        //create the node and tail.next= newNode and make newNode as tail
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }

    public Node findMid(Node head){
        //Using classical Slow fast approach
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }
        return slow;
    }
    public boolean checkPalindrome(Node head){
        //Basecase or Cornercase
        if(head == null || head.next == null){
            return true;
        }
        //Step 1 is to find the mid Node
        Node Mid = findMid(head);

        //Step 2 is to reverse the 2nd half
        Node prev = null;
        Node curr = Mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        Node righthead = prev;
        Node lefthead = head;
        //Step 3 is to find if lefthand is equal to righthand
        while(righthead != null){
            if(lefthead.data != righthead.data){
                return false;
            }
            lefthead = lefthead.next;
            righthead = righthead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(2);
        System.out.println(ll.checkPalindrome(head));

    }
}
