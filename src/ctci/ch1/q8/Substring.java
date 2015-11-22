package ctci.ch1.q8;

public class Substring {
	public static void main(String args[]) {
		String testString = "Apple";
		String testString1 = "pleap";

		if (testString.length() == testString1.length() && testString1.length() > 0) {
			testString = testString.toLowerCase();
			testString = testString + testString;
			System.out.println(testString.contains(testString1));
		} else
			System.out.println(false);
	}
}
