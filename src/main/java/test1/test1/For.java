package test1.test1;

public class For 
{
	public static void main (String[] args)
	{
		System.out.println("Welcome to the For loop Tutorial ! \n");
		//Normal
		for (int i= 1; i<=5 ; i++)
		{
			for (int j = 1; j<= i ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("Reverse pattern !\n");
		//Reverse
		for(int i = 1; i<=5 ; i++)
		{
			for (int j = 5; j >= i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
