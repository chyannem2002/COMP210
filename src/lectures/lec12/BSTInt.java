package lectures.lec12;

public interface BSTInt {
    void add(int value);        // adds a node
    boolean search(int value);  // if found returns true, else returns false.
    void printInOrder();        // prints contents of BST in order.
    Node delete(int value);     // returns root after deleting the node.
}
