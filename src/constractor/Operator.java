package constractor;

public class Operator {

	int score;
	int age;
	String username;
	int health;
	int power;
	public Operator() {
		
	this.score =0;
	this.health=100;
	this.age=25;
	this.username="amirahmad";
		this.attack();
		this.run();
		this.fight();
	}
	
	public Operator(int scoreuser,int poweruser,int healthuser,int ageuser)
	{
		this.score=scoreuser;
		this.power=poweruser;
		this.health=healthuser;
		this.age=ageuser;
		
	}
		
		
		
		
	
	public void attack() {
		
		System.out.println(this.username +"  let's attack");
	}
	
public void fight() {
		
		System.out.println(this.username+"   let's fight");
	}
	
public void run() {
	
	System.out.println("let's run");
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
