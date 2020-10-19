package constractor;

public class ConstractorConcept {

	
	public static void main(String[] args) {
		
		
		Operator of=new Operator();
		
		System.out.println(of.health);
		System.out.println(of.score);
		System.out.println(of.username);
		System.out.println(of.age);
		System.out.println(of.health);
		
		of.health=80;
		of.age =50;
		of.score=20;
		of.username="saman";
		
		System.out.println(of.health);
		System.out.println(of.age);
		
		System.out.println("/////////////////////////////");
		Operator saman=new Operator(0,100,70,40);
		
		saman.username="sina";
		saman.fight();
		saman.username="Ahmadreza";
		saman.attack();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
