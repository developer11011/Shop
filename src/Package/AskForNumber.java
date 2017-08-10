package Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 	These is kind of interesting. This method is used to ask user for number.
 *	 It checks is the user number actually a number (not a string etc.). These method also allows you to set maximum allowed number(first argument). 
 */

public class AskForNumber {
public int Ask(int MaxNumberSize, String Query1, String Query2, String Query3)
{
	int ProductIndex=-1;
	boolean IsIndexCorrect = false;
	int[] tab = new int[MaxNumberSize];
	boolean IsInteger = true;
	
	
	BufferedReader reading = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(Query1);
	while(!IsIndexCorrect)
	{
		boolean IDKhowToNameThis = true;
		try
		{
			ProductIndex = Integer.parseInt(reading.readLine());
		}
		catch(NumberFormatException n)
		{
			System.out.println(Query2);
			IsInteger = false;
			IDKhowToNameThis = false;
		}
		catch(IOException i)
		{
			System.out.println("Data reading error!");
			IsInteger = false;
			IDKhowToNameThis = false;
		}
		if(IsInteger)
		{
		try
		{
			tab[ProductIndex-1] = 3;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(Query3);
			IDKhowToNameThis = false;
		}
		}
		IsInteger = true;
		IsIndexCorrect = IDKhowToNameThis;
	}
	return ProductIndex;
}
	
	
}
