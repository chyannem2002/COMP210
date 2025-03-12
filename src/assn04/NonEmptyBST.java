package assn04;

public class NonEmptyBST<T extends Comparable<T>> implements BST<T> {
	private T _element;
	private BST<T> _left;
	private BST<T> _right;

	public NonEmptyBST(T element) { // constructor to non empty BST
		_left = new EmptyBST<T>();
		_right = new EmptyBST<T>();
		_element = element;
	}

	// TODO: complete the insert method
	@Override
	public BST<T> insert(T element) { //recursive call
		if (element.compareTo(_element) < 0) {
			_left = _left.insert(element);

		} else if (element.compareTo(_element) > 0) {
			_right = _right.insert(element);
		}

		// TODO: +1 when value is greater than node; copy and paste but change to right and element.compare becomes > 0
		return this; // change such default lines as necessary; need to send back to previous frame to ensure the frame/tree is correct
	}

	// TODO: printInOrderTraversal
	@Override
	public void printInOrderTraversal() {
		if (_left != null) {
			_left.printInOrderTraversal();
		}
		System.out.print(_element + " ");

		if (_right != null) {
			_right.printInOrderTraversal();
		}
	}

	// TODO: printPreOrderTraversal
	@Override
	public void printPreOrderTraversal() {
		System.out.print(_element + " ");

		if (_left != null) {
			_left.printPreOrderTraversal();
		}
		if (_right != null) {
			_right.printPreOrderTraversal();
		}
	}

	// TODO: printPostOrderTraversal
	@Override
	public void printPostOrderTraversal() {
		if (_left != null) {
			_left.printPostOrderTraversal();
		}
		if (_right != null) {
			_right.printPostOrderTraversal();
		}
		System.out.print(_element + " ");
	}

	// TODO: remove
	@Override
	public BST<T> remove(T element) {

		if (element.compareTo(_element) < 0) { //element trying to remove is smaller than current position. move to left of tree
			_left = _left.remove(element);
		} else if (element.compareTo(_element) > 0) { // element trying to remove is larger than current position. move to right of tree
			_right = _right.remove(element);

		} else {
			if (_left.isEmpty() && _right.isEmpty()) { // remove (3 initial cases):
				return new EmptyBST<>(); // Case 1: leaf
			}
			// Case 2: One child
			if (_left.isEmpty()) return _right;
			if (_right.isEmpty()) return _left;

			// Case 3: Two children, find successor, copy its value, remove it
			T minRight = _right.findMin();
			_element = minRight;
			_right = _right.remove(minRight);
		}
		return this; // change such default lines as necessary
	}

	// TODO: findMin
	@Override
	public T findMin() {
		if (_left.isEmpty()) return _element;
		return _left.findMin(); // change such default lines as necessary
	}

	// TODO: replaceRange
	@Override
	public BST<T> replaceRange(T start, T end, T newValue) {
		BST<T> updatedTree = removeRange(start, end); // remove elements within [start, end]

		if (newValue.compareTo(start) < 0 || newValue.compareTo(end) > 0) {
			updatedTree = updatedTree.insert(newValue);
		}
		return updatedTree; // change such default lines as necessary

	}

	public BST<T> removeRange(T start, T end) {
		//Empty tree
		if (this.isEmpty()) {
			return this;
		}

		// Case 1: n < start; need to remove everything in range in right tree only
		if (_element.compareTo(start) < 0) {
			_right = _right.removeRange(start, end);
			return this;
		}

		// Case 2: n > end; need to remove everything in left tree w/in range
		if (_element.compareTo(end) > 0) {
			_left = _left.removeRange(start, end);
			return this;
		}

		// Case 3: start <= n <= end
		if (_element.compareTo(start) >= 0 && _element.compareTo(end) <= 0) {
			_left = _left.removeRange(start, end);
			_right = _right.removeRange(start, end);
			return this.remove(_element);
		}
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
