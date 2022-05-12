import java.util.Arrays;
import java.util.Iterator;

public class opdracht4 {
	public static void main(String[] args) {
		ArraySorter d1 = new ArraySorter(); //4
		d1.sorter();
	}
}

//opdracht4
class ArraySorter{
	double[] sorter() {
		double[] raw = new double[10];
		for (int i = 0; i < 10; i++) {
			double random = Math.floor(Math.random() * 100);
			raw[i] = random;
		}
		System.out.println(Arrays.toString(raw));
		double[] sorted = new double[10];
		for (int j = 0; j < raw.length; j++) {
			double currentNumber = raw[j];
			
			if (j == 0) {
				for (int k = j + 1; k < raw.length; k++) {
					if ( raw[k] < currentNumber ) {
						currentNumber = raw[k];
					}			
				}
			} else if (j != 0) {
				for (int k = j + 1; k < raw.length; k++) {
					if ( raw[k] < currentNumber && raw[k] > raw[j - 1]) {
						currentNumber = raw[k];
					}			
				}
			}
			sorted[j] = currentNumber;
		}
		
		
		System.out.println("Het gesorteerde array is: " + Arrays.toString(sorted));
		return sorted;
	}
}








