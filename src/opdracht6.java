import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class opdracht6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the string I need to parse? Please enter below:");
		String stringToParse = sc.nextLine();
		
		StringParser parser = new StringParser();
		parser.parser(stringToParse);
		sc.close();
	}
}

class StringParser{
	String parser(String str){
		str.toLowerCase();
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		
		ArrayList<String> letterList = new ArrayList<String>();
		for( char letter : charArr ) {
			String strLetter = Character.toString(letter);
			if (strLetter != " ") {
				letterList.add(strLetter);
			}
		}		
		
		String finalString = "";
		System.out.println(letterList);
		for(String letter : letterList) {
			finalString = finalString.concat(letter + ", ");
		}
		System.out.println("This is the string alphabetized: \n" + finalString);
		return finalString;
	}
}
