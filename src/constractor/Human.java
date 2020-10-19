package constractor;

public class Human {
    int score;
	String name;
	int age;
	int weigth;
	String eyecolor;
	public Human(int age,int weigth,int score,String name,String eyecolor)
	{
		this.age=age;
		this.weigth=weigth;
		this.score=score;
		this.name=name;
		this.eyecolor=eyecolor;
		
	}
	
	public void eat()
	{
		System.out.println(this.name+" eating");
	}
	public void sleep()
	{
		System.out.println(this.name+" sleeping");
	}
	public void run()
	{
		System.out.println(this.name+" running");
	}
	public void study()
	{
		System.out.println(this.name+"studing");
	}

}
