
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

    void preOrderTreeTraversal()
    {
        preOrder(root);
    }

    void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(" "+root.key);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    void postOrderTreeTraversal()
    {
        postOrder(root);
    }

    void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" "+root.key);

        }

    }

    int search(int key) {
        return searchRecord(root, key, 0);
    }

    int searchRecord(Node root, int key, int depth) {
        if (root == null) {
            return -1; // Key not found
        }

        if (root.key == key) {
            return depth;
        }

        if (key < root.key) {
            return searchRecord(root.left, key, depth + 1);
        } else {
            return searchRecord(root.right, key, depth + 1);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    
    Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
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

        System.out.println("In Order tree traversal");

        tree.inOrderTreeTraversal();

        System.out.println("\nPre Order tree traversal");

        tree.preOrderTreeTraversal();

        System.out.println("\nPost Order tree traversal");

        tree.postOrderTreeTraversal();

        System.out.println(" \nsearching 50 :"+tree.search(90));

        System.out.println("\n\nDelete 70");
        tree.deleteKey(70);   

        System.out.println("\nIn Order tree traversal");

        tree.inOrderTreeTraversal();
     }
}
