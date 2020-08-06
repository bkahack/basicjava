package opps.abstraction;

public abstract class Car {
		public abstract void accelerate();   /*car is a concept. so we created a abstract class
												->we cannt create a object of abstract classs
												->after giving abstract we can leave method without
													implimenting as you can see here
													but implimentation must be witten in its all
													child class!!!! */
		
		public abstract void breaking() ;
		
		
		public void honk() {
			System.out.println("car is honking");  		/*     @ IMPORTANT   @
														this is called concreating we can 
														create non abstract method in a abstract
														class but we cannt create a absrtact method
														without abstract class!! */
		}
			
		
}
