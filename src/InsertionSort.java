
public class InsertionSort {

	public static void main(String[] args) {
		int[] inputArray = { 56, 89, 10, 453, 43578, 32, 56, 67, 12 };
		
		System.out.println("Unsorted array : ");
		for (int print : inputArray)
			System.out.println(print);

		for (int i = 1; i < inputArray.length; i++) {
			int current = inputArray[i];
			for (int j = (i - 1); j >= 0 && inputArray[j] > current; j--) {
				inputArray[j+1] = inputArray[j];
				inputArray[j] = current;
			}
		}
		System.out.println("Sorted array : ");
		for (int print : inputArray)
			System.out.println(print);

	}

}
