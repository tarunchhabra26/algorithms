
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

	/*
	 * Complete the function below.
	 */

	static int countDuplicates(int[] numbers) {
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();

		if (numbers == null || numbers.length == 1)
			return 0;

		for (int num : numbers) {
			if (!unique.add(num)) {
				duplicate.add(num);
			}

		}
		return duplicate.size();
	}

	public static void doesItExist(int[] numbers) {
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		// String nextLine = "";

		if (numbers == null || numbers.length == 1) {
			System.out.println("0");
			System.out.println("0");
			return;
		}

		for (int num : numbers) {
			if (!unique.add(num)) {
				duplicate.add(num);
				int count = map.get(num);
				count++;
				map.put(num, count);
				System.out.print("1");
			} else {
				map.put(num, 1);
				System.out.print("0");
			}

		}
		System.out.println();

		for (int num : numbers) {
			int count = map.get(num);
			if (duplicate.contains(num) && count > 1) {
				System.out.print("1");
				map.put(num, (count - 1));

			} else {
				System.out.print("0");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		//Integer[] numbers=new Integer[args.length];
		//Integer[] numbers = { 1, 3, 1, 4, 5, 6, 3, 2, 1, 1 };
		// int[] numbers = {1,1,1,1,1,2,2};
		//new Solution1().doesItExist(numbers);
		// System.out.println(countDuplicates(numbers));
		
		int[] intarray=new int[args.length];
        int i=0;
        for(String str:args){
            intarray[i]=Integer.parseInt(str.trim());//Exception in this line
            i++;
        }
        doesItExist(intarray);
	}
}
