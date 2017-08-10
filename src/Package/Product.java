package Package;

public class Product { //Keeps basic info about product. Other product classes extends these class
	String name;
	double prize;
	String date;
	int calories;
	String producer;
	
	public Product(String name, double prize, String date, int calories, String producer)
	{
		this.name = name;
		this.prize = prize;
		this.date = date;
		this.calories = calories;
		this.producer = producer;
	}
}

