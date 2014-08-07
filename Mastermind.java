import java.util.*;

public class Mastermind 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int masterNumber;
		int master1, master2, master3, master4;
		int guess1, guess2, guess3, guess4;
		int guessNumber;
		int turns = 0;
		
		masterNumber = 0;
		master4 = 0;
		master3 = 0;
		master2 = 0;
		master1 = 0;
		
		boolean numberReady = false;
		boolean gameover = false;
		
		while (numberReady != true)
		{
			masterNumber = (int) ((Math.random()) * 10000);
			
			master4 = masterNumber % 10;
			master3 = masterNumber % 100 / 10;
			master2 = masterNumber % 1000 / 100;
			master1 = masterNumber % 10000 / 1000;
			
			if (master4 != master3 && master4 != master2 && master4 != master1 && master3 != master2 && master3 != master1 && master2 != master1 && masterNumber != 0)
			{
				numberReady = true;
			}
		}
		
		numberReady = false;
		//System.out.println(masterNumber);
		
		while (gameover == false)
		{
			boolean spot1 = false;
			boolean spot2 = false;
			boolean spot3 = false;
			boolean spot4 = false;
			
			boolean true1 = false;
			boolean true2 = false;
			boolean true3 = false;
			boolean true4 = false;
			
			turns = turns + 1;
			
			System.out.println("Number: ");
			guessNumber = reader.nextInt();
			
			guess4 = guessNumber % 10;
			guess3 = guessNumber % 100/10;
			guess2 = guessNumber % 1000/100;
			guess1 = guessNumber % 10000/1000;
			
			if (guess1 == master1)
			{
				true1 = true;
			}
			
			else
			{
				if (guess1 == master2)
				{
					
					spot1 = true;
				}
				
				else if (guess1 == master3)
				{
					spot1 = true;
				}
				
				else if (guess1 == master4)
				{
					spot1 = true;
				}
			}
			
			if (guess2 == master2)
			{
				true2 = true;
			}
			
			else
			{
				if (guess2 == master1)
				{
					spot2 = true;
				}
				
				else if (guess2 == master3)
				{
					spot2 = true;
				}
				
				else if (guess2 == master4)
				{
					spot2 = true;
				}
			}
			
			if (guess3 == master3)
			{
				true3 = true;
			}
			
			else
			{
				if (guess3 == master1)
				{
					spot3 = true;
				}
				
				else if (guess3 == master2)
				{
					spot3 = true;
				}
				
				else if (guess3 == master4)
				{
					spot3 = true;
				}
			}
			
			if (guess4 == master4)
			{
				true4 = true;
			}
			
			else
			{
				if (guess4 == master1)
				{
					spot4 = true;
				}
				
				else if (guess4 == master2)
				{
					spot4 = true;
				}
				
				else if (guess4 == master3)
				{
					spot4 = true;
				}
			}

			if (true1 == true && true2 == true && true3 == true && true4 == true)
			{
				System.out.println("Fully Correct!");
				System.out.println("Turns: " + turns);
				gameover = true;
			}
			
			else
			{
				if (true1 == true)
				{
					System.out.println("First Column is Correct.");
				}
				
				else
				{
					if (spot1 == true)
					{
						System.out.println("First Column has right number, but is in the wrong column.");
					}
					
					else
					{
						System.out.println("First Column has incorrect number. Number is not used in code.");
					}
				}
				
				if (true2 == true)
				{
					System.out.println("Second Column is Correct.");
				}
				
				else
				{
					if (spot2 == true)
					{
						System.out.println("Second Column has right number, but is in the wrong column.");
					}
					
					else
					{
						System.out.println("Second Column has incorrect number. Number is not used in code.");
					}
				}
				
				if (true3 == true)
				{
					System.out.println("Third Column is Correct.");
				}
				
				else
				{
					if (spot3 == true)
					{
						System.out.println("Third Column has right number, but is in the wrong column.");
					}					
					
					else
					{
						System.out.println("Third Column has incorrect number. Number is not used in code.");
					}
				}
				
				if (true4 == true)
				{
					System.out.println("Fourth Column is Correct.");
				}
				
				else
				{
					if (spot4 == true)
					{
						System.out.println("Fourth Column has right number, but is in the wrong column.");
					}
							
					else
					{
						System.out.println("Fourth Column has incorrect number. Number is not used in code.");
					}
				}
			}
			System.out.println("");
		}
		
	}
}
