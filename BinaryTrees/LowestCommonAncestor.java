package BinaryTrees;

import java.util.ArrayList;

public class LowestCommonAncestor {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            
        }
    }

    public static boolean getPath(Node root,int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
    public static Node lca(Node root, int n1, int n2){ //O(N)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //lowest common ancestor
        int i = 0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }

    //Approach 2

    //No Auxilary Data Structure like ArrayList is used in this approach O(N)
    public static Node lca2(Node root,int n1,int n2){

        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1,n2);
        Node rightLca = lca2(root.right ,n1,n2);

        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }

        return root;
    }


    //Program to find min distance between 2 nodes
    public static int lcaDist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }
    public static int mindist(Node root,int n1,int n2){
        Node lca = lca2(root,n1,n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);

        return dist1 + dist2;
    }

    //Program to Find Kth Ancestor

    public static int kthancestor(Node root,int n,int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = kthancestor(root.left, n, k);
        int rightDist = kthancestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist,rightDist);

        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }

    //Program to Transfer To SUM Tree
    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int LeftChild = transform(root.left);
        int RightChild = transform(root.right);

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        int data = root.data;
        root.data = newLeft + LeftChild + newRight + RightChild;
        return data;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 6;

        System.out.println(lca(root,n1,n2).data); //lca app 1
        System.out.println(lca2(root,n1,n2).data); //lca app 2

        System.out.println(mindist(root, n1, n2)); //minm dist bw 2 nodes

        int k = 2;
        int n = 5;
        kthancestor(root,n,k); //Kth Ancestor from given node

        transform(root);
        preorder(root);
    }
}
