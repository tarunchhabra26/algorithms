package ctci.ch1.q4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "tarun";
		String str2 = "divya";
		System.out.println(new Anagram().isAnagram(str1,str2));

	}
	
	public boolean isAnagram(String str1, String str2){
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		
		if (new String(str1Char).equals(new String(str2Char)))
			return true;
		return false;
		
	}

}
