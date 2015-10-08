import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args)
		{
			Scanner input = new Scanner (System.in);
			
			String hand;
			char rps;
			int rand;			
			rand = (int)(Math.random() * 3 ) + 0;
			System.out.println("Today we play a game of rock paper scissors!");
			System.out.println("You will be facing the computer.");
			System.out.print("Now pick your poison! 'r' = rock\n'p' = paper"
							+ "\n's' = scissors: ");
			hand = input.next();
			
			rps = hand.charAt(0);
			
			//System.out.println(randomNum);
			
			if ((rand == 0) && rps == 'r' )
			{
				System.out.println("Rock vs rock. Tie, Not even close Baby!");
			}
			else if ((rand == 1) && (rps == 'p'))
			{
				System.out.println("Paper vs paper. Tie, Paper view.");
			}
			
			else if ((rand == 2) && (rps == 's'))
			{
				System.out.println("Scissors vs scissors. Tie, You almost made the cut.");
			}
			
			else if ((rand == 0) && (rps == 'p'))
			{
				System.out.println("Rock vs paper. Victory!");
			}
			else if ((rand == 0) && (rps == 's'))
			{
				System.out.println("Rock vs scissors. Defeat!");
			}
			
			else if ((rand == 1) && (rps == 'r'))
			{
				System.out.println("Paper vs rock. Defeat! ");
			}
			else if ((rand == 1) && (rps == 's'))
			{
				System.out.println("Paper vs scissors. Victory!");
			}
			
			else if ((rand == 2) && (rps == 'r'))
			{
				System.out.println("Scissors vs rock. Victory!");
			}
			else if ((rand == 2) && (rps == 'p'))
			{
				System.out.println("Scissors vs paper. Defeat! ");
			}
	}

}
