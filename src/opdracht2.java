import java.util.Arrays;
import java.util.Iterator;

public class opdracht2 {
	public static void main(String[] args) {
		Efinder b1 = new Efinder(); //2
		b1.finder("Find me al the e's that are in this sentence.");
	}
}

//opdracht 2
class Efinder{
	int finder(String a) {
		char[] seperated = a.toCharArray();
		int count = 0;
		System.out.println(seperated.length);
		for(int x = 0; x < seperated.length; x++) {
			if (seperated[x] == 'e') {
				count++;
			}
		}
		System.out.println("Opdracht 2:");
		System.out.println("The number of e's in the sentence are: " + count);
		return count;
	}
}