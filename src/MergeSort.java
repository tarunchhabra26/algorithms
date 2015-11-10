
public class MergeSort {
	private int[] tempMergeArray;
	private int[] array;
	private int length;
	
	public static void main(String[] args) {
		
		int[] inputArray = { 56, 89, 10, 453, 43578, 32, 56, 67, 12 };
		System.out.println("Unsorted array : ");
		for (int print : inputArray)
			System.out.println(print);
		
		MergeSort oMergeSort = new MergeSort();
		oMergeSort.sort(inputArray);
		
		System.out.println("Sorted array : ");
		for (int print : inputArray)
			System.out.println(print);

	}
	
	public void sort(int[] inputArray){
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergeArray = new int[length];
		doMergeSort(0,(length-1));
	}

	private void doMergeSort(int startIndex, int endIndex) {
		if (startIndex < endIndex){
			int middle = startIndex + (endIndex - startIndex)/2;
			doMergeSort(startIndex,middle);
			doMergeSort((middle + 1), endIndex);
			mergeParts(startIndex,middle,endIndex);
		}
		
	}

	private void mergeParts(int startIndex, int middle, int endIndex) {
		for (int i = startIndex ; i <= endIndex ; i ++){
			tempMergeArray[i] = array[i];
		}
		
		int i = startIndex;
		int j = middle + 1;
		int k = startIndex;
		
		while(i <= middle && j <= endIndex){
			if (tempMergeArray[i] <= tempMergeArray[j]){
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while(i <= middle){
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
		
	}
	
}
