package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[] orgs) {
		
		
	int a[]=new int[4];	
	int b=10;
	int c=20;
	int d=30;
	int f=40;
	int g=b+d;
		
	System.out.println(g);	
	
	
	
	
	
	String name[]=new String[3];
	
	String h="hello";
	String t="bye";
	String y="see you";
	
		
	System.out.println(h);	
	System.out.println(t);	
	System.out.println(y);	

	
	ArrayList ar = new ArrayList();
	
	ar.add(200);
	ar.add(150);
	ar.add("i love you");
	ar.add(12.22);
	ar.add('A');
	ar.add(true);
	
	System.out.println(ar.get(2));
	System.out.println("//////////////////////////////////////");
	System.out.println(ar.size());
	
	
		
		
	
	
	
	
	
	
	
	
	
	ArrayList ar3=new ArrayList();
	
	
	Employee e1 = new Employee("Naveen",27,"QA");	
	Employee e2 = new Employee("Rasul",37,"Boss");	
	Employee e3 = new Employee("Helen",29,"wife of boss");	
		
		
	ArrayList<Employee> ar4 =new ArrayList<Employee>();
		
	ar4.add(e1);
	ar4.add(e2);
    ar4.add(e3);
	
	Iterator<Employee> it = ar4.iterator();
	while (it.hasNext())
	{
		Employee nrh =it.next();
		System.out.println(nrh.name);
		System.out.println(nrh.age);
		System.out.println(nrh.deparment);
		
		
	}
    
    
    
    
    
    
    
    
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
