 package collectionFrameWork.linkedList;



public class LLImp<E> {

Node<E> head;
	
	public void add(E data) {
		Node<E> toAdd =new Node<E>(data);
		if (isEmpty()) {
			head =toAdd;
			
			return;
		}
		Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
		
	}
	public E getLast() throws Exception{
		Node<E> temp=head;
		if(isEmpty()) {
			throw new Exception("Peeking from empty LinkedList is not Allowd");
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		return temp.data;
	}
	public E removeLast() throws Exception {
		Node<E> temp=head;
		if(isEmpty()) {
			throw new Exception("Removing from empty LinkedList is not Allowd");
		}
		if(temp.next ==null) {
			Node <E> toRemove=head;
			head=null;
			return toRemove.data;
			
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node <E> toRemove=temp.next;
		temp.next=null;
		return toRemove.data;
	}
	
	static class Node<E>{
		E data;
		
		Node<E> next;
		public Node(E data) {
			this.data=data;
			
			next=null;
		}
			
	}
	 public boolean isEmpty() {
		return head==null;
	}
	void print() {
		Node<E> temp=head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}