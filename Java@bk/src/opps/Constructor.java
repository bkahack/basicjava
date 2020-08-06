package opps;

class Vehicle{
	int wheels;
	int headlight;
	Vehicle(){
		wheels=4;
	}
	 Vehicle(int wheels) {
		 this.wheels=wheels;
	}
	 Vehicle(double wheels) {
		 this.wheels=(int)wheels;
	}

}

public class Constructor {
	Constructor(){
		System.out.println("object is now created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj =new Constructor();
	//	Vehicle car =new Vehicle();
		Vehicle car1 =new Vehicle(5);
		Vehicle car2 =new Vehicle(6.5);
	//	System.out.println(car.wheels);
	//	System.out.println(car.headlight);
		System.out.println(car1.wheels);
		System.out.println(car1.headlight);
		System.out.println(car2.wheels);
		System.out.println(car2.headlight);

	}

}