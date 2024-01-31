package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("How many days are you going to Vegas: ");
		int totalSimulations = in.nextInt();
		
		int count = 1;
	
		while (count <= totalSimulations) {
			
			System.out.print("How much money will you be betting today (in $): ");
			int startAmount = in.nextInt();
	
			System.out.print("what is the win chance: ");
			double winChance = in.nextDouble();
	
			System.out.print("Win Limit: ");
			int winLimit = in.nextInt();
	
			while (startAmount < winLimit && startAmount != 0)
			{
	
				double outcome = (Math.random()*100);
				if (outcome <= winChance) {
					startAmount = startAmount + 1;				
				}
				else if (outcome > winChance) {
					startAmount = startAmount - 1;
	
				}
	
			}
			System.out.println("Final count: " + startAmount);
			count = count + 1;
		}
		
		
	}
}
