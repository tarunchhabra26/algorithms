package careercup.amz;

public class SecondLargestNumber {
	public static int getSecondLargest(int[] arr){
		int first, second ;
		
		first = arr[0];
		second = first;
		
		for (int i = 0 ; i < arr.length ; i++){
			if (first < arr[i] && second < arr[i]){
				second = first;
				first = arr[i];
			} else if (i > second){
				second = arr[i];
			}
		}
		return second;
	}
	
	public static void main (String args[]){
		int[] input = {1,2,3,4,5,4,5};
		System.out.println(getSecondLargest(input));
	}

}
