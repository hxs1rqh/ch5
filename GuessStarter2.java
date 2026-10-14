import java.util.Random; 
import java.util.Scanner; 

public class GuessStarter2 {

	public static void main(String[] args) { 
		Random random = new Random(); 
		int number = random.nextInt(100) +1;
		Scanner in = new Scanner(System.in); 
		
		System.out.println("I'm thinking of a number between 1 and 100"); 
		System.out.println("(including both). Can you guess what it is?"); 
		
	for (int attempt = 1; attempt <=3; attempt++) {
		System.out.print("Type a number: ");
		int guess = in.nextInt(); 
		
		if (guess == number) {
			System.out.println("You go it! The number was " + number + ".");
			return;
		} else if (guess < number) {
			System.out.println("Too low.");
		} else { 
			System.out.println("Too high."); 
		}
	}
	
	System.out.println("Sorry, you're out of guesses. The number was " + number + ".");
	
}
}
