package ctci.ch1.q7;

public class MatrixSetZero {
	public static void main(String args[]){
		System.out.println("The matrix that we have");
		int matrix[][] = {{2,3,4},
						  {5,7,7},
						  {8,9,10}};
		int length = matrix.length;
		printMatrix(matrix);
		
		MatrixSetZero msz = new MatrixSetZero();
		matrix = msz.setMatrixZero(matrix);
		System.out.println("Modified matrix");
		printMatrix(matrix);
		
	}
	
	private int[][] setMatrixZero(int[][] matrix) {
		
		int row[] = new int[matrix.length];
		int column[] = new int[matrix[0].length];
		for (int i = 0 ; i  < matrix.length ; i++){
			for (int j = 0 ; j < matrix[0].length ; j++){
				if (matrix[i][j] == 0){
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		
		for (int i = 0 ; i  < matrix.length ; i++){
			for (int j = 0 ; j < matrix[0].length ; j++){
				if (row[i] == 1 || column[j] == 1){
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
	
}
