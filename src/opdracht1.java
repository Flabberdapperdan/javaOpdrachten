public class opdracht1 {
	public static void main(String[] args) {
		StringConcat a1 = new StringConcat(); //1
		a1.concat("Het is vandaag", " dinsdag.");
	}
}

//opdracht 1
class StringConcat{
	void concat(String s1, String s2) {
		String newString = s1 + s2;
		System.out.println("Opdracht1:");
		System.out.println(newString);
	}
}