public class opdracht3 {
	public static void main(String[] args) {
		StringConcat a1 = new StringConcat(); //1
		a1.concat("Het is vandaag", " dinsdag.");
		
		Efinder b1 = new Efinder(); //2
		b1.finder("Find me al the e's that are in this sentence.");
		
		ArrayCount c1 = new ArrayCount(); //3
		int[] testArr = {1, 2, 4, 6, 4, 2, 5, 7, 3, 2};
		c1.counter(testArr);
		
		ArraySorter d1 = new ArraySorter(); //4
		d1.sorter();
	}
}

//opdracht 3
class ArrayCount{
	int counter(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
		System.out.println("Opdracht 3: ");
		System.out.println("Het totaal van de array is: " + count);
		return count;
	}
}