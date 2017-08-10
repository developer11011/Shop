package Package;

public class BoughtProductNormal {
	String name;
	int amount;
	double prize;
	double FinalPrize;
	
	public BoughtProductNormal(String name, int amount, double FinalPrize, double prize)
	{
		this.name = name;
		this.amount = amount;
		this.FinalPrize = FinalPrize;
		this.prize = prize;
	}
	public void display()
	{
		System.out.println(name+"  |  amount: "+amount+"  |  prize per piece: "+prize+"$  |  final prize: "+FinalPrize+"$");
	}
}
