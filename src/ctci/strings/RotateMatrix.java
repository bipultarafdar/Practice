package ctci.strings;

//reverse columns and then transpose

public class RotateMatrix {

	public static void rotate(int[][] m) {
		reverseCols(m);
		print(m.length, m[0].length, m);
		transpose(m);
	}
	
	public static void transpose(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = i; j < cols; j++) {
				int temp = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = temp;
			}
		}
	}
	
	public static void reverseCols(int[][] m) {
		int rows = m.length;
		int cols = m[0].length;
		for(int i = 0; i < rows/2; i++) {
			for(int j = 0; j < cols; j++) {
				int temp = m[i][j];
				m[i][j] = m[rows - i - 1][j];
				m[rows - i - 1][j] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int[][] m = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				m[i][j] = col * i + j;
			}
		}
		print(row, col, m);
		rotate(m);
		print(row, col, m);
		
	}

	private static void print(int row, int col, int[][] m) {
		System.out.println();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
