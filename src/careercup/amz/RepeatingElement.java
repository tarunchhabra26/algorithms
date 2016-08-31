package careercup.amz;

public class RepeatingElement {

		public static int getRepeat(int[] arr){
			int repeat = 0;
			for(int i = 0 ; i < arr.length ; i++){
				if (arr[Math.abs(arr[i])] >= 0){
					arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				} else {
					repeat = Math.abs(arr[i]);
					break;
				}
			}
			return repeat;
		}
		
		public static void main(String args[]){
			int[] input = {1,3,3,4,5,2,8};
			System.out.println(getRepeat(input));
		}
}
