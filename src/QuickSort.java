
public class QuickSort {
	private int[] array;
	private int length;

	public static void main(String[] args) {

		int[] inputArray = { 56, 89, 10, 453, 43578, 32, 56, 67, 12 };
		System.out.println("Unsorted array : ");
		for (int print : inputArray)
			System.out.println(print);

		//Add code for quick sort
		QuickSort oQuickSort = new QuickSort();
		oQuickSort.sort(inputArray);
		
		System.out.println("Sorted array : ");
		for (int print : inputArray)
			System.out.println(print);

	}

	public void sort(int[] inputArray) {
		if (inputArray == null || inputArray.length == 0) {
			return;
		}

		this.array = inputArray;
		this.length = inputArray.length;
		quicksort(0, length - 1);
	}

	private void quicksort(int startIndex, int endIndex) {
		int i = startIndex;
		int j = endIndex;

		int pivot = this.array[startIndex + (endIndex - startIndex) / 2];
		while (i <= j) {
			while (this.array[i] < pivot) {
				i++;
			}
			while (this.array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		if (startIndex  < j)
			quicksort(startIndex,j);
		if (i < endIndex)
			quicksort(i, endIndex);
	}
}
