package ctci.ch1.q1;

public class UniqueString {
	
	public static void main(String args[]){
		String test = "AABC";
		int checker = 0;
		for (int i = 0 ; i < test.length() ; i++){
			int val = test.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0){
				System.out.println(false);
				break;
			} checker |= (1 << val);
		}
		//System.out.println(true);
	}

}
