package collectionFrameWork.linkedList;

import java.util.*;

public class LinkedListIntero {

	public static void main(String[] args) {
		List<String> fruits=new LinkedList<>();
		List<String> vegitable=new LinkedList();
		fruits.add("Apple");
		fruits.add("Orange");
		vegitable.add("tomato");
		vegitable.add("carrot");
		
		//	after adding all thing of vegetable into fruits
		fruits.addAll(vegitable);
		System.out.println(fruits);
		
		
		//it will return the size of a arrayLISt similar to .length function
		System.out.println(fruits.size());
		
		
		// it will convert array list into array						IMPORTANT
				 String arr[]=new String[fruits.size()];
				 fruits.toArray(arr);
				 for(String e : arr) {
					 System.out.print(e+ " ");
				 }
		
		
		//it will return true and false value it check that the value is avilable or not
		System.out.println(fruits.contains("carrot"));
		
		
		// for getting the value of any index
		System.out.println(fruits.get(3));
		
		
		// for updating the value at any index
		fruits.set(1, "banana");
		System.out.println(fruits);
		
		
		// for removing any value
		fruits.remove(2);
		System.out.println(fruits);
		
		
		//for removing a particular value of a object
		fruits.removeAll(vegitable);
		System.out.println(fruits);
		
		
		// it will remove all the thing in ArraylIst and return empty array
		fruits.clear();
		System.out.println(fruits);
	}
	}