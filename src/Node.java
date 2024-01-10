class Node<E> {
	private E data;
	private Node<E> next;

	Node(E data, Node<E> next) { // (3)
		this.data = data;
		this.next = next;
	}

	public void setData(E data) {
		this.data = data;
	} // (4)

	public E getData() {
		return this.data;
	} // (5)

	public void setNext(Node<E> next) {
		this.next = next;
	} // (6)

	public Node<E> getNext() {
		return this.next;
	} // (7)

	public String toString() { // (8)
		return this.data.toString() +
		(this.next == null ? "" : ", " + this.next.toString());
		}
	
	}