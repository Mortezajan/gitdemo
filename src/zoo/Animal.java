package zoo;

public class Animal {
	private String name;
	private String color;
	private int age;
    private int price;

	public Animal(int age, String name, String color) {
		this.age = age;
		this.name = name;
		this.color = color;

	}

	
	
	public void setprice(int price) {
		if(price >10 && price<100) {
		
		this.price = price;
		}
	}


	public int getprice() {
		System.out.println(this.price *10+"$");
		return price;
	}

	
	
}
