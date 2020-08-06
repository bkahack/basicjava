package collectionFrameWork.queue;
import java.util.*;
public class QueueIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> que=new LinkedList<>();
		for(int i=0 ;i<10 ;i++)
		que.offer(i);
		
		int r=que.poll();
		System.out.println(r);
		r=que.poll();
		System.out.println(r);
		System.out.println(que.peek());
		System.out.println(que);
		
	}

}
