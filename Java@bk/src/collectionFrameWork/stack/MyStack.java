package collectionFrameWork.stack;
import collectionFrameWork.stack.Implimentaton;
public class MyStack {

	public static  void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Implimentaton<Integer>  stack=new Implimentaton();
		for(int i=0 ;i<10 ;i++) {
		stack.push(i);
		}
		int c=stack.pop();
		System.out.println(c);
		
		int d=stack.peek();
		System.out.println(d);
		
	}

}
