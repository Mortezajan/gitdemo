package zoo;

public class Bird extends Animal {
	
	
	public Bird(int age, String name, String color) {
		super(age, name, color);
	}

	public void fly()
	{
		
		System.out.println("the bird is flying");
	}
	public void eat()
	{
		System.out.println("my bird is eating differently");
	}
	public void sleep()
	{
		System.out.println("my bird sleep on the tree");
	}

}
