package collectionFrameWork.linkedList;

import java.util.*;

public class LLvsAL {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();
		getTimeDiff(al);
		getTimeDiff(ll);

	}
	 static void getTimeDiff(List<Integer> list) {
		 long start=System.currentTimeMillis();
		 for(int i=0 ; i<100000 ; i++) {
			 list.add(0,i);
			 
		 }
		 long end=System.currentTimeMillis();
		 System.out.println(list.getClass().getName() + " " + (end-start));
		 LLImp<Integer> own =new LLImp<Integer>();
		 own.add(24);
		 own.add(56);
		 own.add(21);
		 own.print();

	 }
}
