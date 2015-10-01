import java.util.Scanner;
public class Lab3a {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num,num1;
		
		num1 = 0 +(int)(Math.random() * 10);
		
		System.out.println("Please enter a number 0-10: ");
		num = input.nextInt();
		
		if ((num >= 0) && (num <= 10))
		{
			if(num < num1)
			{
			System.out.println("Your number is lower than the random number :(");
			}
		else if (num > num1)
			{
			System.out.println("Your number is greater than the random number :(");
			}
		else 
		{
		System.out.println("Congradulations you won!");
		}
		}
		else
		{
		System.out.println("You did not enter a number 0-10.");
		}
		System.out.println(num1);

	}

}