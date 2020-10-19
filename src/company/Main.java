package company;

public class Main {

	public static void main(String[] args) {
		Cof co=new Cof();
		Stuff st= new Stuff();
		Cff cf=new Cff();

		paysalary(co);
		paysalary(st);
		paysalary(cf);
		
	}

	
public static void paysalary(Employee emp)
{
	emp.paysalary();
}
}
