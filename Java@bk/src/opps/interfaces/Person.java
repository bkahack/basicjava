package opps.interfaces;

public class Person implements Student ,Youtuber {

	public static void main(String[] args) {
		Person p=new Person();
		p.study();
		p.makeVideo();

	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("person is Studing");
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is making video");
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

}
