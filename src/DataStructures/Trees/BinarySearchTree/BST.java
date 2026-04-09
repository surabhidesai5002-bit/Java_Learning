package DataStructures.Trees.BinarySearchTree;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key =key;
        this.left=null;
        this.right=null;
    }
}

public class BST {
    Node root;

    //Default Constructor
    BST(){
        root=null;
    }

    //Inorder dfs
    void DFS3(Node root){
        if(root==null){
            return;
        }
        DFS3(root.left);
        System.out.print(root.key + " ");
        DFS3(root.right);
    }

    //insert
    //Helper Function
    private Node insertRec(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key< root.key){
            root.left = insertRec(root.left,key);
        } else if (key>root.key) {
            root.right = insertRec(root.right,key);
        }
        return root;
    }

    //Main Callable
    public void insert(int key){
        root = insertRec(root,key);
    }

    //search
    private boolean searchRec(Node root,int key){
        if(root==null){
            return false;
        }
        if(key==root.key){
            return true;
        }
        else if(key< root.key){
            return searchRec(root.left,key);
        }else {
            return searchRec(root.right, key);
        }
    }

    //Main Callable
    public boolean search(int key){
        return searchRec(root,key);
    }

    //delete
    private Node findSuccessor(Node node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    //helper function
    private Node removeRec(Node root,int key){
        if(root==null){
            return null;
        }
        if(key<root.key){
            root.left = removeRec(root.left,key);
        }else if (key>root.key) {
            root.right = removeRec(root.right,key);
        }else{ //key==root.key

            //u found key to deleted

            //case1 : node with 0 or 1 child
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            //case2 : node with 2 children
            Node Successor = findSuccessor(root.right);
            root.key = Successor.key;
            root.right = removeRec(root.right,Successor.key);
        }
        return root;
    }

    //Main Callable
    public void remove(int key){
        root = removeRec(root,key);
    }
}
class  Driver{
    static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(80);
        bst.insert(50);
        bst.insert(90);
        bst.insert(180);
        bst.DFS3(bst.root);
        int key = 90;
        System.out.println();
        System.out.println(bst.search(key));
        bst.remove(key);
        bst.DFS3(bst.root);
        System.out.println();
        System.out.println(bst.search(key));
    }
}
