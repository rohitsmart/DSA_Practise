
class Node{
    int key;
    Node left,right;
    Node(int key)
    {
        this.key=key;
        left=right=null;
    }
}

public class BST {

    Node root;

    BST()
    {
        root=null;
    }

    void insert(int key)
    {
        root= insertRecord(root,key);
    }
    Node insertRecord(Node root,int key)
    {
        if(root==null)
        {
            root= new Node(key);
            return root;
        }

        if(key<root.key)
        {
            root.left=insertRecord(root.left, key);
        }
        else if(key>root.key){
            root.right = insertRecord(root.right, key);
        }

        return root;
    }

    void inOrderTreeTraversal()
    {
        inOrder(root);
    }

    void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(" "+root.key+"");
            inOrder(root.right);
        }
    }
   
    public static void main(String[] args) {
        System.out.println("creating tree::");
        BST tree = new BST();

        System.out.println("inserting node into the tree");

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inOrderTreeTraversal();
    }
}
