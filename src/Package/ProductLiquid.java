package Package;


public class ProductLiquid extends Product {
	
	ProductLiquid(String name, double prize, String date, int calories, String producer)
	{
		super(name, prize, date, calories, producer);
		
	}
	
	//Prizes of different bottles sizes(prize0 = 0.5 liter bottle,   prize1 = 1 liter bottle,   prize2 = 1.5 liter bottle,   prize3 = 2 liter bottle)
	double prize0 = PrizeRound(prize/2);
	double prize1 = prize;
	double prize2 = PrizeRound(prize*1.5);
	double prize3 = PrizeRound(prize*2);
	
	
	public double PrizeRound(double p)//Used to round prize (ex. 1,999999999998 = 1,99)
	{
		p *= 100;
		p = Math.round(p);
		return p/100;
	}
	
	public double CountPrize(int HowMany, int capacity)//Yes, i know these is really shitty solution, i will change it soon. Anyway these method is used to count prize final prize for different bottle sizes
	{
		if(capacity == 1)
		{
			return PrizeRound(HowMany*prize0);
		}
		else if(capacity == 2)
		{
			return PrizeRound(HowMany*prize1);
		}
		else if(capacity == 3)
		{
			return PrizeRound(HowMany*prize2);
		}
		else
		{
			return PrizeRound(HowMany*prize3);
		}
	}
	
	public String capacityName(int capacity)//Another horrible solution to display bottle sizes XD
	{
		if(capacity == 1)
		{
			return "0.5 liter";
		}
		else if(capacity == 2)
		{
			return "1 liter";
		}
		else if(capacity == 3)
		{
			return "1.5 liter";
		}
		else
		{
			return "2 liter";
		}
	}

}

