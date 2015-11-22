package ctci.ch1.q5;

public class ReplaceStrings {

	public static void main(String[] args) {
		String str = "Quick brown fox jumpepd over the lazy dog";
		int length = str.length();

		str = new ReplaceStrings().replaceSpaces(str.toCharArray(), length);
		System.out.println(str);

	}

	public String replaceSpaces(char[] string,int length){
		int newLength = 0;
		int spaceCount = 0;
		//Count the number of spaces
		for (int i = 0 ; i < length ; i++){
			if (string[i] == ' '){
				spaceCount++;
			}
		}
		
		newLength = length + (3*spaceCount);
		char[] newString = new char[newLength];
		for (int i = (length-1) ; i >= 0 ; i--){
			if (string[i] == ' '){
				newString[newLength - 1] = '0';
				newString[newLength - 2] = '2';
				newString[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				newString[newLength - 1] = string[i];
				newLength--;
			}
		}
		
		return new String(newString);
	}

}
