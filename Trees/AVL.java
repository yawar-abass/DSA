package Trees;
//Pending
public class AVL {
    private static class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int data) {
            this.data = data;
            this.height = 1;
        }
    }

    private Node root;

    int height(Node n) {
        if (n == null) {
            return 0;
        }
        return n.height;
    }

    // Right Rotate
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        // perform rotation
        x.right = y;
        y.left = T2;
        // Update Heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        // Return the new root
        return x;
    }

    // Left Rotate
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        // perform Rotation
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        // Return the new root
        return y;
    }

    // Balance Factor
    int getBalance(Node N) {
        if (N == null) {
            return 0;
        }
        return height(N.right) - height(N.right);
    }

    public void insert(int item) {
        root = insert(root, item);
    }

    public Node insert(Node root, int item) {
        if (root == null) {
            return (new Node(item));
        }
       if (item > root.data) {
            root.right = insert(root.right, item);
        } else if (item < root.data) {
            root.left = insert(root.left, item);
        } else { // Duplicate not allowed
            return root;
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int bal = getBalance(root);
        // Left Left Rotate
        if (bal > 1 && item < root.left.data)
            return rightRotate(root);
        // Right Right case
        if (bal < -1 && item > root.right.data){
          return leftRotate(root);
        }
        // Left Right case
        if (bal > 1 && item > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // Right Left Case
        if (bal < -1 && item < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    void preorder(Node node){
        if(node!=null){
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        System.out.println("Preorder Traversal ");
        tree.preorder(tree.root);
    }
}

