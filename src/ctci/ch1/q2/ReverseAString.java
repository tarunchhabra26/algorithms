package ctci.ch1.q2;

public class ReverseAString {
	
	public static void main (String args[]){
		String input = "Hamari adhuri kahani";
		System.out.println("Reversed String : " + new ReverseAString().reverseString(input));
	}
	
	public String reverseString (String str){
		char[] data = str.toCharArray();
		int i = 0;
		int j = data.length - 1;
		char temp;
		
		while (i < j){
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;
		}
		
		return (new String(data));
		
	}

}
