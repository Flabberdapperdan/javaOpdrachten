import java.util.Scanner;

class opdracht10 {
	public static void main(String[] args) {
		OpVakantie v1 = new OpVakantie();
		v1.speler();
	}
}

class OpVakantie{
	String vorigeWoord = "";
	String woordenStreng = "";
	Scanner sc = new Scanner(System.in);
	
	void speler() {
		if (this.vorigeWoord.length() == 0) {
			System.out.println("Wat is het eerste woord?");
			String input = sc.next();
			this.vorigeWoord = input;
			this.woordenStreng += input;
			speler();
		} else {
			System.out.println("Wat is het volgende woord?");
			String input = sc.next();
			checker(input);
		}		
	}
	
	void checker(String woord) {
		char[] woordArr = woord.toCharArray();
		char[] vorigeWoordArr = this.vorigeWoord.toCharArray();
		if (woordArr[0] == vorigeWoordArr[vorigeWoordArr.length - 1]) {
			this.woordenStreng += " " + woord;
			this.vorigeWoord = woord;
			System.out.println("Gezegd is: " + this.woordenStreng);
			speler();
		} else {
			System.out.println("Dat woord klopt niet. Probeer het nog een keer");
			speler();
		}
	}
}