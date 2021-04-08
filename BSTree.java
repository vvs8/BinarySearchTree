import java.util.*;

public class BSTree {
    Node root;
    int size;
    ArrayList <Integer> keys = new ArrayList <Integer>();
    int sum = 0;

    BSTree() {
        root = null;
    }

    public Node getNode(int key) {
        return TreeSearch(root, key);
    }

    //TreeSearch
    public Node TreeSearch(Node n, int key) {
        if (n.isExternal()) {
            return n;
        }
        else {
            if(n.key > key) {
                return TreeSearch(n.getLeft(), key);
            }
            else if (n.key < key) {
                return TreeSearch(n.getRight(), key);
            }
            else return n;
        }
    }

    //Insert node
    public void insert(Entry e, int key) {
        root = insert2(root, e, key);
        size++;
        keys.add(key);
        sum += key;
    }

    private Node insert2(Node cur, Entry e, int key) {
        if (cur == null) {
            cur = new Node(e, key);
            return cur;
        }
        if (key < cur.key) {
            cur.left = insert2(cur.left, e, key);
        }
        else if (key > cur.key) {
            cur.right = insert2(cur.right, e, key);
        }
        return cur;
    }

    public void inorder() {
        inorder2(root);
    }

    private void inorder2(Node root) {
        if (root != null) {
            inorder2(root.left);
            System.out.println(root.key);
            inorder2(root.right);
        }
    }

    //Diagram Printer
    public void printDiagram() {
        System.out.println("\n*** Tree Diagram ***");
        diagram(root, 0, false, "");
        treeDetails();
    }

    //Diagram printing recursive function
    private void diagram(Node n, int depth, boolean isLeaf, String S) {
        if (n == null)
            return;
        for (int i = 1; i < depth; ++i)
            System.out.print("\t   ");
        if (n == root)
            System.out.println(n + " <- root");
        else
            System.out.print("   L___> " + S + " " + n + "\n");

        diagram(n.getRight(), depth + 1, null == n.getRight(), "RIGHT");
        diagram(n.getLeft(), depth + 1, null == n.getLeft(), "LEFT");

    }

    public void treeDetails() {
        System.out.println("Size: " + size);
        System.out.println("Mean: " + mean());
        System.out.println("Sum: " + sum);
        System.out.println("Median: " + median());
    }

    //Get mean
    public float mean() {
        return sum / (float) size;
    }

    //Get median
    public double median() {
        Collections.sort(keys);
        ArrayList A = keys;
        double median;
        int n = size/2;
        if (size % 2 == 0)
            median = ((double) (int) A.get(n) + (double) (int) A.get(n))/2;
        else
            median = (double) (int) A.get(n);
        return median;
    }

    //Remove node
    public void removeNode(int key) {
        deleteNode(this.root, key);
        size--;
        keys.remove(key);
        sum -= key;
    }

    private Node deleteNode(Node root, int key) {
        if(root == null)
            return root;
        if(key < root.getKey()) {
            root.setLeft(deleteNode(root.getLeft(), key));
        }
        else if(key > root.getKey()) {
            root.setRight(deleteNode(root.getRight(), key));
        }
        else {
            if(root.getLeft() == null && root.getRight() == null) {
                return null;
            }
            else if(root.getLeft() == null) {
                return root.getRight();
            }
            else if(root.getRight() == null) {
                return root.getLeft();
            }
            else {
                Node min = minValue(root.getRight());
                root.setNode(min.key, min.data);
                root.setRight(deleteNode(root.getRight(), min.key));
            }
        }
        return root;
    }

    private Node minValue(Node node) {
        if(node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node;
    }

}


