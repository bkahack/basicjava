package collectionFrameWork.queue;

public class OwnQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyQueue queue=new MyQueue<Integer>();
		
		queue.add(5);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}

}
