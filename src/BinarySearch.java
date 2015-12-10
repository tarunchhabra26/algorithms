import java.util.Arrays;

public class BinarySearch {
	private static int index = 0;
	public static void main(String args[]) {
		int[] inputArray = { 56, 89, 32,90 };
		int element = 90;
		// Make sure that the array is sorted
		Arrays.sort(inputArray);

		for (int index : inputArray)
			System.out.println(index);

		int found = binarySearch(inputArray, element);

		if (found >= 0)
			System.out.println("Element : " + element + " is found in the given array at index : " + index);
		else
			System.out.println("Element : " + element + " was not found in the given array");
	}

	private static int binarySearch(int[] inputArray, int element) {
		int minNumber = 0;
		int maxNumber = inputArray.length - 1;
		//int index = 0;
		return recursiveBinSearch(inputArray, element, minNumber, maxNumber);

	}

	private static int recursiveBinSearch(int[] inputArray, int element, int minNumber, int maxNumber) {
		int found = 0;
		if (maxNumber < minNumber) {
			return -1;
		} 
		int	midPoint = minNumber + (maxNumber - minNumber) / 2;
		if (inputArray[midPoint] > element)
			return recursiveBinSearch(inputArray, element, minNumber, midPoint - 1);
		else if (inputArray[midPoint] < element)
			return recursiveBinSearch(inputArray, element, midPoint + 1, maxNumber);
		else{
			index = midPoint;
			return midPoint;
		}
	}

}
