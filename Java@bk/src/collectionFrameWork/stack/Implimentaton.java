package collectionFrameWork.stack;

import collectionFrameWork.linkedList.LLImp;

public class Implimentaton<E> {
	private LLImp<E> ll=new LLImp<E>();
	void push(E e) {
	ll.add(e);	
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Pooping form empty stack is not allowed");
		}
		return ll.removeLast();
	}
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking from empty stack is not allowed");
		}
		return ll.getLast();
	}
	 }