package careercup.amz;

import java.util.Arrays;

public class ShortestNumberInList {

	public static int getSmallest(int[] input){
		
		Arrays.sort(input);
		int small = input[0];
		return small - 1;
		
	}
	
	public static void main(String args[]){
		int[] input = {-1,0,-15,-22,-24};
		System.out.println(getSmallest(input));
	}
}
