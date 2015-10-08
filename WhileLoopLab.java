import java.util.Scanner;
public class WhileLoopLab {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int GuessNum = 0 + (int)(Math.random()*10);
		int guess = 0;
		int i = 0;
		int j = 0;
		String response;
		System.out.printf("Guess a number between 0 to 10.\nYou have 3 tries to guess correctly! \n", GuessNum);

		while (i<3)
		{
			guess = input.nextInt();
		if ((guess<0)||(guess>10))
		{
			System.out.println("You choose a number not between 0 and 10.");
			if (i<3)
			{
				System.out.println("Try again!");
				i++;
				j++;
			}
		}
		if ((guess>=0)&&(guess<=10))
		{
			if (guess==GuessNum)
			{
				System.out.println("You guessed correctly!");
				i=3;
			}
		else
		{
			response=(guess>GuessNum)?"You guessed too high.\n":"You guessed too low.\n";
			System.out.printf(response);
			if (i<2)
			{
				System.out.println("Try again!");
			}
		i++;
		if(i==2)
		{
			System.out.println("You have one more chance to guess the number, Don't mess up!");
		}
		j++;
		}
	}
}

		if (j == 3)
		{
			System.out.println("You failed to guess 3 times.");
		}
}
}

// Test msg
