package Package;

public class BoughtProductLiquid extends BoughtProductNormal {
	String capacityName;
	public BoughtProductLiquid(String name, int amount, double FinalPrize, double prize, String capacityName) {
		super(name, amount, FinalPrize, prize);
		this.capacityName = capacityName;
	}
	
	public void display()
	{
		System.out.println(name+"  |  capacity: "+capacityName+"  |  amount: "+amount+"  |  prize per 1 liter: "+prize+"$  |  final prize: "+FinalPrize+"$");
	}
}
