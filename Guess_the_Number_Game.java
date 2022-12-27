
import java.util.Scanner;

public class Guess_the_Number_Game
 {

	public static void guessing_the_Number_Game()
	{
		Scanner s = new Scanner(System.in);

		int number = 1 + (int)(100* Math.random());
		System.out.println("Enter the number of trails can be done");
		int no_of_trails = s.nextInt();

		int x, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100. "
			+ "Guess the number"
			+ " within "+no_of_trails+" trials.");


		for (x = 0; x < no_of_trails; x++) {

			System.out.println(
				"Guess the number:");
			guess = s.nextInt();

			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& x != no_of_trails - 1) {
				System.out.println(
					"Sorry,the number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& x != no_of_trails - 1) {
				System.out.println(
					"Sorry,the number is"
					+ " less than " + guess);
			}
		}

		if (x == no_of_trails) {
			System.out.println(
				"You have exhausted"
				+no_of_trails+" trials.");

			System.out.println(
				"The actual number is" + number);
		}
	}

	public static void
	main(String arg[])
	{
		guessing_the_Number_Game();
	}
}
