import java.util.Scanner;
public class Lab3b {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int num,num1;
		
		String a = "Your number is greater than the random number";
		String b = "Your number is lower than the random number";
		String c = "Your number is equal to the random number, Congratulations!";
		String d =("You did not enter a number 0-10.");
		num1 = 0 +(int)(Math.random() * 10);
		String result;
		System.out.println(num1);
		System.out.println("Please enter a number 0-10: ");
		num = input.nextInt();
		if (num1 != num)
		{
		result =(num >= num1)?a:b;
		System.out.println(result);
		}
		else if (num == num1)
		{
			System.out.println(c);
		}
				

		
		
		if (num > 10 || num < 0)
		{
			System.out.println(d);
		}
		input.close();

	}
}