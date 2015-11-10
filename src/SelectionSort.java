
public class SelectionSort {

	public static void main(String[] args) {
		int[] inputArray = { 56, 89, 10, 453, 43578, 32, 56, 67, 12 };

		System.out.println("Unsorted array : ");
		for (int print : inputArray)
			System.out.println(print);

		for (int i = 0; i < (inputArray.length - 1); i++) {
			int current = i;
			for (int j = (i+1); j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[current]) {
					current = j;
				}
			}
			
			if (current != i){
				int temp = inputArray[i];
				inputArray[i] = inputArray[current];
				inputArray[current] = temp;
			}
		}
		System.out.println("Sorted array : ");
		for (int print : inputArray)
			System.out.println(print);

	}

}
