package BST;
//Binary Search Tree
public class Basics {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
        public static Node insert(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if(root.data > val){
                root.left = insert(root.left,val);
            }else{
                root.right = insert(root.right,val);
            }
            return root;
        }

        //inorder traversal of BST gives a sorted sequence 
        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        //Search in BST takes O(H) time complexity
        public static boolean search(Node root,int key){
            if(root == null){
                return false;
            }
            if(root.data == key){
                return true;
            }
            if(root.data > key){
                return search(root.left,key);
            }else{
                return search(root.right, key);
            }
        }

        //Deleting a Node - V.Imp
        public static Node delete(Node root,int val){
            if(root.data < val){
                root.right = delete(root.right,val);
            }
            else if(root.data >  val){
                root.left = delete(root.left, val);
            }

            else{ //voila

                //case 1 - Deleting a leaf node - Delete Node and return null to parent
                if(root.left == null && root.right == null){
                    return null;
                }
                
                //case 2 - Single Child - Delete Node & replace node with child node
                if(root.left == null){
                    return root.right;
                }
                else if(root.right ==  null){
                    return root.left;
                }

                //Case 3 - Two Children - Replace value with Inorder Successor. Delete the node for IS.
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                delete(root.right, IS.data);
            }

            return root;
        }

        public static Node findInorderSuccessor(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }

        //Print in Range
        public static void PrintInRange(Node root,int k1,int k2){
            if(root == null){
                return;
            }
            else if(root.data < k1){
                PrintInRange(root.left, k1, k2);
            }else{
                PrintInRange(root.right, k1, k2);
            }
        }
        public static void main(String[] args) {
            int values[] = {5,1,3,4,2,7};
            Node root = null;
            for(int i=0;i<values.length;i++){
                root = insert(root,values[i]);
            }

            inorder(root);
            System.out.println();

            if(search(root, 6)){
                System.out.println("Found");
            }else{
                System.out.println("Not Found");
            }

            root = delete(root,1);
            System.out.println("");
            inorder(root);


            PrintInRange(root, 2, 8);
        }
}

