package interfaces;

public class Sparrow extends Bird implements Flyable{

	@Override
	public void sleep() {
		System.out.println("this is sparrow i can fly very well");
	}

	@Override
	public void fly() {
		System.out.println("this is sparrow i can sleep very well");
	}

	
	
}
