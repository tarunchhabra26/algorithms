package ctci.ch3.q4;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TowerOfHanoi toh = new TowerOfHanoi();
		int numberOfDiscs = 10;
		toh.solve(numberOfDiscs, "A", "B", "C");
		
	}
	
	public void solve(int n, String start, String aux, String end){
		if (n == 1){
			System.out.println(start + "->" + end);
		} else {
			solve(n-1,start,end,aux);
			System.out.println(start + "->" + end);
			solve(n-1,aux,start,end);
		}
		
	}

}
