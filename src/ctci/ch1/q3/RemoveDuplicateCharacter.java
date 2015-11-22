package ctci.ch1.q3;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		String input = "aabb";

		System.out.println(new RemoveDuplicateCharacter().removeDuplicate(input));

	}

	public String removeDuplicate(String input) {
		boolean seen[] = new boolean[256];
		StringBuffer strBuffer = new StringBuffer(seen.length);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!seen[ch]) {
				seen[ch] = true;
				strBuffer.append(ch);
			}
		}
		return strBuffer.toString();
	}
}
