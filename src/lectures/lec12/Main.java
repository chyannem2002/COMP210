package lectures.lec12;

public class Main {
    public static void main(String[] args){
        BST bst = new BST(52);
        bst.printInOrder();
        bst.add(30);
        bst.printInOrder();
        bst.add(40);
        bst.add(20);
        bst.add(47);
        bst.printInOrder();
        int key = 40;
        System.out.println(key + " exists? " + bst.search(key));  // search TBD
        key = 10;
        System.out.println(key + " exists? " + bst.search(key));
    }
}
