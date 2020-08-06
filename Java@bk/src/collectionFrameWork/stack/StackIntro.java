package collectionFrameWork.stack;

import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		// this push function in stack is use to store (example plate ke upper plate)
		stack.push(24);
		stack.push(20);
		stack.push(25);
		stack.push(0);
		stack.push(4);
		stack.push(450);
		//this pop function is used to remove last element form the stack
		stack.pop();
		stack.pop();
		//this peek function is used to see what is the last element is stack
		System.out.println(stack.peek());
		System.out.println(stack);
	}

}
