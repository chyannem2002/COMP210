package lectures.lec12;

public class BST implements BSTInt{
    Node _root;

    public BST (int value){  // Constructor
        _root = new Node(value);
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);
        if (_root == null)
            _root = node;
        addRec(_root, node);
    }

    // recursively adds a new node starting at node parent.
    void addRec(Node parent, Node node){
        if (parent._value > node._value) {    // add to left
            if (parent._left != null)
                addRec(parent._left, node);
            else
                parent._left = node;
        }
        else {                          // add to right
            if (parent._right != null)
                addRec(parent._right, node);
            else
                parent._right = node;
            }
    }

    @Override
    public boolean search(int value) {
        return searchRec(_root, value);
    }

    // recursive search (TBD)
    boolean searchRec(Node node, int value){
        if (node._value == value)
            return true;
        if (node._value > value) {
            if (node._left != null)
                return searchRec(node._left, value);
            else
                return false;
        }
        if (node._right != null)
            return searchRec(node._right, value);
        else
            return false;
    }

    @Override
    public Node delete(int value) {     // Future TBD
        return null;
    }

    @Override
    public void printInOrder() {
        System.out.println("\nPrinting BST in Order:");
        printInOrderRec(_root);
        System.out.println();
    }

    public void printInOrderRec(Node node) {   // recursive
        if (node._left != null)
            printInOrderRec(node._left);
        System.out.print(" -> " + node._value);
        if (node._right != null)
            printInOrderRec(node._right);
    }
}
