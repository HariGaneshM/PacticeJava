package Practice;

public class Code9 {

	public static void main(String[] args) {
		
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] B = {{9,1,3},{4,2,6},{7,4,9}};
		
		Code9 methods = new Code9();
		methods.printMatrix(methods.compareMatrix(A, B));
		
	}

	public int[][] compareMatrix(int[][] P, int[][] Q) {
		
		int[][] R = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (P[i][j]==Q[i][j])
					R[i][j] = 1;
				else
					R[i][j] = 0;
			}
		}
		return R;
	}
	
	public void printMatrix(int[][] Z) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(Z[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
