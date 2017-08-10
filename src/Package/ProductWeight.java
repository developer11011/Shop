package Package;


public class ProductWeight extends Product {
	
	ProductWeight(String name, double prize, String date, int calories, String producer)
	{
		super(name, prize, date, calories, producer);
	}
	
	
	double PrizePerOneDecagram = prize/100;
	
	double CountPrize(int dec)//Just count and round prize
	{
		double FinalPrize = dec * PrizePerOneDecagram;	
  
		FinalPrize *= 100; 
		FinalPrize = Math.round(FinalPrize);
		return FinalPrize /= 100; 
	}
}

