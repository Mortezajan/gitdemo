package constractor;

public class Earth {

	public static void main(String[] args) {
       
	
	Human rasul=new Human(40,70,0,"nahid","blue");
	
	System.out.println(rasul.age);
	System.out.println(rasul.weigth);
	System.out.println(rasul.score);
	System.out.println(rasul.name);
	System.out.println(rasul.eyecolor);
	System.out.println("*********************************");
	rasul.eat();
	rasul.sleep();
	rasul.run();
	rasul.name="rasul jan is ";
	rasul.study();
	
	
	
	
	
	
	
	
	}

}
