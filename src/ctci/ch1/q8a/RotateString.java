package ctci.ch1.q8a;

public class RotateString {

	public static void main(String[] args) {
		String testString = "HelloWorld";
		int rotationFactor = 2;

		System.out.println("Original String : " + testString);
		testString = rotateString(testString, rotationFactor);

		System.out.println("Rotated String : " + testString);

	}

	private static String rotateString(String testString, int rotationFactor) {
		StringBuffer substring = new StringBuffer(testString.substring((testString.length() - rotationFactor - 1), testString.length()));
		StringBuffer sb = new StringBuffer(testString);
		sb = new StringBuffer(sb.substring(0,sb.length() - 1 - rotationFactor));
		substring.append(sb);
		return substring.toString();
	}

}
