package assn04;

public class NonEmptyBST<T extends Comparable<T>> implements BST<T> {
	private T _element;
	private BST<T> _left;
	private BST<T> _right;

	public NonEmptyBST(T element) {
		_left = new EmptyBST<T>();
		_right = new EmptyBST<T>();
		_element = element;
	}

	// TODO: complete the insert method
	@Override
	public BST<T> insert(T element){
		if (element.compareTo(_element) < 0){
			if (_left.isEmpty()){
				NonEmptyBST<T> bst = new NonEmptyBST<>(element);
				_left = bst;
			}
			else
				_left.insert(element);
		}
		// TODO:

		return this; // change such default lines as necessary
	}

	// TODO: printInOrderTraversal
	@Override
	public void printInOrderTraversal() {

	}

	// TODO: printPreOrderTraversal
	@Override
	public void printPreOrderTraversal() {

	}

	// TODO: printPostOrderTraversal
	@Override
	public void printPostOrderTraversal() {

	}

	// TODO: remove
	@Override
	public BST<T> remove(T element) {
		if (_element.compareTo(element) == 0) {  // remove (3 initial cases):
			if (_left.isEmpty() && _right.isEmpty()) // leaf
				return new EmptyBST<>();
			// TODO

		}
		return this; // change such default lines as necessary
	}

	// TODO: findMin
	@Override
	public T findMin() {

		return null; // change such default lines as necessary
	}

	// TODO: replaceRange
	@Override
	public BST<T> replaceRange(T start, T end, T newValue) {

		return this; // change such default lines as necessary
	}

	public BST<T> removeRange(T start, T end) {

		return this; // change such default lines as necessary
	}

	//====================================================================
	// Do not change the methods below
	@Override
	public int getHeight() {
		   return Math.max(_left.getHeight(), _right.getHeight())+1;
	}

	@Override
	public BST<T> getLeft() {
		return _left;
	}

	@Override
	public BST<T> getRight() {
		return _right;
	}

	@Override
	public T getElement() {
		return _element;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

}
