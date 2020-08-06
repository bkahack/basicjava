package collectionFrameWork.queue;

public class MyQueue<E> {
	Node head;
	Node tail;
	public void add(E data) {
		Node toAdd=new Node<E>(data);
		if(tail==null) {
			tail=head=toAdd;
			return;
		}
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=toAdd;
	}
	public E remove() throws Exception{
		if(head==null) {
			throw new Exception("Removing for empty Queue is not allowed");
		}
		Node<E> temp=head;
		head=head.next;
		return  temp.data;
	}
	
	
	public static class Node<E>{
			Node<E> next;
			E data;
			public Node(E data){
				this.data=data;
				next=null;
			}
			
	}
	
}
