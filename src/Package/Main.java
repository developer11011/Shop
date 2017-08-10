package Package;

public class Main {
	
	public static void main(String[] args) {
			//Here i create arrays witch contains products details
			String[] PNname = {"Coffe", "Egs", "Potato Crisp", "Noddles", "Chocolate Creme"};
			double[] PNprize = {21.99, 6.99, 4.00, 2.80, 12.35};
			String[] PNdate = {"12-12-2018", "12-09-2017", "12-11-2018", "01-01-2018", "20-05-2019"};
			int[] PNcalories = {160, 90, 430, 240, 690};
			String[] PNproducer = {"Jacobs", "Chickens", "Lays", "Knor", "Nutella"};
			int[] PNweight = {800, 600, 240, 500, 950};
			
			String[] PWname = {"Apple", "Potato", "Orange", "Banana", "Pistache"};
			double[] PWprize = {1.60, 0.99, 4.55, 7.15, 27.99};
			String[] PWdate = {"---", "---", "---", "---", "---"};
			int[] PWcalories = {60, 36, 129, 290, 411};
			String[] PWproducer = {"Plantation", "Plantation", "Plantation", "Plantation", "Plantation"};
			
			String[] PLname = {"Mikl", "Cola", "Bottle of Water", "Isotonic Drink", "Beer"};
			double[] PLprize = {2.15, 4.99, 0.99, 3.50, 3.00};
			String[] PLdate = {"06-10-2017", "29-04-2018", "01-01-2019", "19-01-2018", "04-10-2018"};
			int[] PLcalories = {90, 350, 0, 258, 591};
			String[] PLproducer = {"Cow", "Coca-Cola", "Muszynianka", "Red Bull", "Kasztelan"};
			
			//Here i create arrays with products
			ProductNormal[] NormalProducts = new ProductNormal[5]; 
			ProductWeight[] WeightProducts = new ProductWeight[5];
			ProductLiquid[] LiquidProducts = new ProductLiquid[5];
			
			//these loop create products objects in arrays
			for(int i=0; i<5; i++)
			{
				  NormalProducts[i] = new ProductNormal(PNname[i], PNprize[i], PNdate[i], PNcalories[i], PNproducer[i], PNweight[i]);
				  WeightProducts[i] = new ProductWeight(PWname[i], PWprize[i], PWdate[i], PWcalories[i], PWproducer[i]);
				  LiquidProducts[i] = new ProductLiquid(PLname[i], PLprize[i], PLdate[i], PLcalories[i], PLproducer[i]);
			}
			
			
			
			
			
			//These piece of code displays list of available products
			System.out.println("\n WELCOME IN MY SHOP! IF YOU WANT TO PURCHASE A PRODUCT SIMPLY TYPE IT`S NUMBER AND PRESS ENTER. \n \n");
			
			int x=1;
			for(ProductNormal n : NormalProducts)
			{				
				 System.out.println(x+". "+n.name+"  |  "+n.prize+"$  |  "+n.calories+" calories/100g  |  "+"best-before date: "+n.date+"  |  Producer: "+n.producer+"  |  Weight: "+n.weight+"g\n");
				 x++;
			}
			
			for(ProductWeight w : WeightProducts)
			{				
				 System.out.println(x+". "+w.name+"  |  "+w.prize+"$  |  "+w.calories+" calories/100g  |  "+"best-before date: "+w.date+"  |  Producer: "+w.producer+"\n");
				 x++;
			}
			
			for(ProductLiquid l : LiquidProducts)
			{				
				 System.out.println(x+". "+l.name+"  |  "+l.prize+"$ per 1 liter  |  "+l.calories+" calories/100g  |  "+"best-before date: "+l.date+"  |  Producer: "+l.producer+"\n");
				 x++;
			}
			System.out.println("16. Finish and pay \n");
	
			
			
			
			//Here i create arrays witch will store bought products
			BoughtProductNormal[] NormalBought = new BoughtProductNormal[5];
			BoughtProductWeight[] WeightBought = new BoughtProductWeight[5];
			BoughtProductLiquid[] LiquidBought = new BoughtProductLiquid[5];
			
			
			
			AskForNumber Number = new AskForNumber();
			
			
			int counterNormal=0;
			int counterWeight=0;
			int counterLiquid=0;

			int ProductNumber=0;
			int BoughtProductsArrayIndexCounter=0;
			int [] BoughtProductsNumbers = new int[16];
			
			boolean end = false;
			
			while(!end)//The main loop
			{
				boolean correctNumber = false;
				while(!correctNumber)//These loop checks if user has bought chosen product before. 
				{
					boolean is = false;
					boolean isnt = false;
					
					 ProductNumber = Number.Ask(16, "PRODUCT NUMBER: ", "Wrong product number! \n Enter correct product number: ", "There is no product with sutch index! \n Enter correct product number: ");
					 for(int i=0; i<16; i++)
					 {
						 if(BoughtProductsNumbers[i]==ProductNumber)
						 {
							 is=true;
						 }
						 else
						 {
							 isnt=true;
						 }
					 }
					 if(is==true)
					 {
						 System.out.println("You have already bought this product!");
						 correctNumber = false;
					 }
					 else if(isnt==true)
					 {
						 correctNumber = true;
						 BoughtProductsNumbers[BoughtProductsArrayIndexCounter]=ProductNumber;
						 BoughtProductsArrayIndexCounter++;
					 } 
				}
				
			
				
				
			if(ProductNumber>=1 && ProductNumber<=5)//These is main if statement. Is asks user about details like "how many pieces of product you wan to buy". It also adds bought products to bought products list
			{
				System.out.println("You have chooen "+NormalProducts[ProductNumber-1].name);
				int HowMany0 = Number.Ask(20, "How many you want to buy (max 20 pieces, "+NormalProducts[ProductNumber-1].prize+"$ per piece): ", "Please type integer number: ", "Wrong number! \n Please type integer number between 1 and 20: " );
				System.out.println("Well done! You have bought "+HowMany0+" pieces of "+NormalProducts[ProductNumber-1].name+" for "+NormalProducts[ProductNumber-1].prize+"$ per piece. Final prize: "+NormalProducts[ProductNumber-1].CountPrize(HowMany0)+"$\n");
				
				NormalBought[counterNormal] = new BoughtProductNormal(NormalProducts[ProductNumber-1].name, HowMany0, NormalProducts[ProductNumber-1].CountPrize(HowMany0), NormalProducts[ProductNumber-1].prize);
				counterNormal++;
			}
			
			else if(ProductNumber>=6 && ProductNumber<=10)
			{
				System.out.println("You have chooen "+WeightProducts[ProductNumber-6].name);
				int HowMany1 = Number.Ask(1000, "How many decagrams you want to buy (max 1000 decagrams, "+WeightProducts[ProductNumber-6].prize+"$ per 100 decagrams): ", "Please type integer number: ", "Wrong number! \n Please type integer number between 1 and 1000: " );
				System.out.println("Well done! You have bought "+HowMany1+" decagrams of "+WeightProducts[ProductNumber-6].name+" for "+WeightProducts[ProductNumber-6].prize+"$ per 100 decagrams. Final prize: "+WeightProducts[ProductNumber-6].CountPrize(HowMany1)+"$\n");
				
				WeightBought[counterWeight] = new BoughtProductWeight(WeightProducts[ProductNumber-6].name, HowMany1, WeightProducts[ProductNumber-6].CountPrize(HowMany1), WeightProducts[ProductNumber-6].prize);
				counterWeight++;
			}
			
			else if(ProductNumber>=11 && ProductNumber<=15)
			{
				System.out.println("You have chooen "+LiquidProducts[ProductNumber-11].name);
				System.out.println("1. 0,5 liter - "+LiquidProducts[ProductNumber-11].prize0+"$");
				System.out.println("2. 1 liter - "+LiquidProducts[ProductNumber-11].prize1+"$");
				System.out.println("3. 1,5 liter - "+LiquidProducts[ProductNumber-11].prize2+"$");
				System.out.println("4. 2 liter - "+LiquidProducts[ProductNumber-11].prize3+"$");
				
				int capacity = Number.Ask(4, "What capacity you want to buy: ", "Please type integer number: ",  "Wrong number! \n Please type integer number between 1 and 4: ");
				int HowMany2 = Number.Ask(20, "How many of "+LiquidProducts[ProductNumber-11].name+" "+LiquidProducts[ProductNumber-11].capacityName(capacity)+" you want to buy (max 20): ", "Please type integer number: ",  "Wrong number! \n Please type integer number between 1 and 20: ");
				System.out.println("Well done! You have bought "+HowMany2+" bottles of "+LiquidProducts[ProductNumber-11].name+" Final prize: "+LiquidProducts[ProductNumber-11].CountPrize(HowMany2, capacity)+"$");	
			
				LiquidBought[counterLiquid] = new BoughtProductLiquid(LiquidProducts[ProductNumber-11].name, HowMany2, LiquidProducts[ProductNumber-11].CountPrize(HowMany2, capacity), LiquidProducts[ProductNumber-11].prize, LiquidProducts[ProductNumber-11].capacityName(capacity));
				counterLiquid++;
			
			}
			
			else 
			{
				
				if(BoughtProductsNumbers[0]==16)
				{
					System.out.println("Ohh, i see you havent bought any of our products. That is a shame, hope you will come back soon!");
				}
				else
				{
				
				//These 3 loops displays kind of receipt 
				int ProductNumberCounter = 1;
				double FinalAllPrize = 0;
				System.out.println("RECEIPT:");
				for(int i=0; i<counterNormal; i++)
				{
					System.out.print(ProductNumberCounter+". ");
					NormalBought[i].display();
					FinalAllPrize += NormalBought[i].FinalPrize;
					ProductNumberCounter++;
				}
				
				for(int i=0; i<counterWeight; i++)
				{
					System.out.print(ProductNumberCounter+". ");
					WeightBought[i].display();
					FinalAllPrize += WeightBought[i].FinalPrize;
					ProductNumberCounter++;
				}
				
				for(int i=0; i<counterLiquid; i++)
				{
					System.out.print(ProductNumberCounter+". ");
					LiquidBought[i].display();
					FinalAllPrize += LiquidBought[i].FinalPrize;
					ProductNumberCounter++;
				}
				System.out.println("FINAL PRIZE: "+FinalAllPrize+"$");
				
				}
				end = true;	
			}
			}		
	}	
}



