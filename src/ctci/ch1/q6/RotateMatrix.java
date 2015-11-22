package ctci.ch1.q6;

public class RotateMatrix {

	public static void main(String[] args) {
		System.out.println("The matrix that we have");
		int matrix[][] = {{2,3,4},
						  {5,6,7},
						  {8,9,10}};
		int length = matrix.length;
		System.out.println("Original Matrix");
		printMatrix(matrix, length);
		
		int[][] rm1 = matrix;
		int[][] rm2 = matrix;
		
		RotateMatrix rm = new RotateMatrix();
		rm1 = rm.transposeMatrix(rm1, length);
		rm1 = rm.swapMatrix(rm1, length);
		
		System.out.println("Anti-clockwise rotated matrix (90 degrees)");
		printMatrix(rm1, length);
		
		System.out.println("Clockwise rotated matrix (90 degrees)");
		rm2 = rm.swapMatrix(rm2, length);
		rm2 = rm.transposeMatrix(rm2, length);
		printMatrix(rm2, length);
				
		}
	
	private static void printMatrix(int[][] matrix,int length){
		for (int i = 0 ; i < length ; i++){
			for (int j = 0 ; j < length ; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] transposeMatrix(int[][] matrix,int size){
		for (int i = 0 ; i < size ; i++){
			for (int j = i ; j < size ; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
	}
	
	public int[][] swapMatrix(int[][] matrix,int size){
		for (int i = 0, k = (size - 1); i < k ; i++, k--){
			int[] temp = matrix[i];
			matrix[i] = matrix[k];
			matrix[k] = temp;
		}
		return matrix;
	}

}
