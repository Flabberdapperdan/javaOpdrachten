import java.util.Scanner;

class opdracht7{
	public static void main(String[] args) {
		Lingo l1 = new Lingo();
		
		System.out.println("Het woord is: _____");
		l1.newRound();
	}
}

class Lingo{
	String secretWord = "appel";
	boolean won = false;
	Scanner sc = new Scanner(System.in);
	
	void newRound() {
		if (!this.won) {
			String input = newInput();
			int[] outcome = inputChecker(this.secretWord, input);
			winChecker(outcome);
			System.out.println("Almost! Try again: ");
			newRound();				
		}
	}
	String newInput() {
		String userInput = sc.nextLine();
		return userInput;
	}
	int[] inputChecker(String secret, String input) {
		char[] secretArr = secret.toCharArray();
		char[] inputArr = input.toCharArray();
		int[] outcomeArr = new int[5];
		for (int i = 0; i < inputArr.length; i++) {
			outcomeArr[i] = 0;
			for (int j = 0; j < secretArr.length; j++) {
				if (secretArr[j] == inputArr[i]) {
					outcomeArr[i] = 1;
				}
			}
			if (secretArr[i] == inputArr[i]) {
				outcomeArr[i] = 2;
			}	
		}
		String outcomeString = "";
		for (int number : outcomeArr) {
			outcomeString += Integer.toString(number);
		}
		System.out.println(outcomeString);
		return outcomeArr;
	}
	boolean winChecker(int[] outcome) {
		this.won = true;
		for (int each : outcome) {
			if( each == 1 || each == 0) {
				this.won = false;
			}
		}
		if (this.won) {
			System.out.println("You won!");
		}
		return won;
	}
}

