package main;

public class CABPuzzle 
{
	// main entry
	public static void main(String[] args)
	{
		// starts at largest 3 digit square, ends at smallest 3 digit square with i as a two digit number
		for(int i = (int) Math.pow(1000, 0.5); i >= (int) Math.pow(100, 0.5); i--)
		{
			String AB = i + "";
			String CAB = i*i + "";
			// if AB == AB in CAB
			if(AB.equals(CAB.substring(1)))
			{
				System.out.print(CAB.substring(0, 1));
			}
		}
		
		System.out.print(" is the value C such that AB^2 = CAB");
	}	
}
