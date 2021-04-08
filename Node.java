class Node {
    int key;
    Entry data;
    Node left;
    Node right;

    Node(Entry data, int key) {
        this.key = key;
        this.data = data;
        right = null;
        left = null;
    }

    public Node getLeft() {
        if (this.left != null)
            return this.left;
        else return null;
    }

    public Node getRight() {
        if (this.right != null)
            return this.right;
        else return null;
    }

    public boolean isExternal() {
        if (left == null && right == null)
            return true;
        else return false;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public void setNode(int key, Entry data) {
        this.key = key;
        this.data = data;
    }




    public String toString() {
        return "("+ data.data + ", " + key + ")";
    }
}

