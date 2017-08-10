package Package;

public class ProductNormal extends Product {
	int weight;
	ProductNormal(String name, double prize, String date, int calories, String producer, int weight)
	{
		super(name, prize, date, calories, producer);
		this.weight = weight;
	}
	
	double CountPrize(int pieces)
	{
		double FinalPrize = pieces * prize;
		FinalPrize *= 100;
		FinalPrize = Math.round(FinalPrize);
		return FinalPrize / 100;
	}
}

