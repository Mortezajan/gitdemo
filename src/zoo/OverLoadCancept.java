package zoo;

public class OverLoadCancept {

	public static void main(String[] args) {
		
		
	System.out.println(OverLoadCancept.add(11, 20));	
	System.out.println(OverLoadCancept.add(20.25, 20.5));	
	System.out.println(OverLoadCancept.add("name  "," lastname"));	

		
		

	}
	static int add(int a,int b) {
		return a+b;
	}

static double add(double a,double b) {
	return a+b;
}

static String add(String  a,String b) {
	return a+b;
}

	
	
	
	
	
}
