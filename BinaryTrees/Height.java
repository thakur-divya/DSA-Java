package BinaryTrees;

public class Height {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){ //O(N) calc height of tree
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    public static int count(Node root){  //O(N) Counting no of Nodes
        if(root == null){
            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc+rc+1;
    }

    public static int sum(Node root){  //O(N) Sum of Nodes
        if(root == null){
            return 0;
        }
        int ls = sum(root.left);
        int rs = sum(root.right);
        return ls+rs+root.data;
    }

    public static int diameter(Node root){  //O(N2) Calc Diameter of a tree
        if(root == null){
            return 0;
        }
        int leftdiam = diameter(root.left);
        int leftht = height(root.left);
        int rightdiam = diameter(root.right);
        int rightht = height(root.right);
        int selfDiam = leftht + rightht + 1;

        return Math.max(selfDiam,Math.max(leftdiam,rightdiam));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree is " + height(root));
        System.out.println("Count of Nodes is " + count(root));
        System.out.println("Sum of Nodes is " + sum(root));
        System.out.println("Diameter of Tree is " + diameter(root));
    }
}
