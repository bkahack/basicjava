package collectionFrameWork.arrayList;

public class Pair<X ,Y> {

	X x;
	Y y;
	public Pair(X x ,Y y) {
		this.x=x;
		this.y=y;
	}
	public void getDiscription() {
		System.out.println(x +" x and y " +y);
	}

}
