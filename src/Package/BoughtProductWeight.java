package Package;

public class BoughtProductWeight extends BoughtProductNormal{

	public BoughtProductWeight(String name, int amount, double FinalPrize, double prize) {
		super(name, amount, FinalPrize, prize);
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println(name+"  |  amount: "+amount+"  |  prize per 100 dag: "+prize+"$  |  final prize: "+FinalPrize+"$");
	}

}
