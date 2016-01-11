
public class HeapSort {

	private static int N;

	public static void main(String args[]) {
		 int[] inputArray = { 56, 89, 10, 453, 43578, 32, 56, 67, 12 };
		//int[] inputArray = null;
		System.out.println("Unsorted array : ");
		printArray(inputArray);

		sort(inputArray);

		System.out.println("Sorted array : ");
		printArray(inputArray);

	}

	private static void printArray(int[] arr) {
		if (arr == null)
			System.out.println("The array is not initialized !!");
		else
			for (int print : arr)
				System.out.println(print);
	}

	public static void sort(int arr[]) {
		if (arr != null) {
			heapify(arr);
			for (int i = N; i > 0; i--) {
				swap(arr, 0, i);
				N = N - 1;
				maxheap(arr, 0);
			}
		}
	}

	public static void heapify(int arr[]) {
		N = arr.length - 1;
		for (int i = N / 2; i >= 0; i--) {
			maxheap(arr, i);
		}
	}

	private static void maxheap(int[] arr, int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;
		if (left <= N && arr[left] > arr[i])
			max = left;

		if (right <= N && arr[right] > arr[max])
			max = right;

		if (max != i) {
			swap(arr, i, max);
			maxheap(arr, max);
		}

	}

	private static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}

}
