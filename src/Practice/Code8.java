package Practice;

public class Code8 {

	public static void main(String[] args) {

		int A[][] = new int[3][3];
		A[0][1] = A[1][1] = A[2][2] = 3;
		A[0][0] = A[0][2] = A[1][0] = 2;
		A[2][1] = A[2][0] = A[1][2] = 1;

		Code8 methods = new Code8();
		methods.repetitionFinder(A);

	}

	public void repetitionFinder(int[][] A) {
		
		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < 3; b++) {
				int k = 0, n = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						k = A[a][b];
						if (k == A[i][j])
							n++;
					}
				}
				System.out.println(k + " is repeated " + n + " times");
			}
		}
	}
}