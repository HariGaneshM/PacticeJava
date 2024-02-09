package Practice;

public class Code4 {
	
	public static int solution(int[] A) {
		
		int squareSum=0,cubeSum=0,sum=0;
		for (int i=0; i<A.length; i++) {
			if (i%2==0) {
				cubeSum = cubeSum+(A[i]*A[i]*A[i]);
			}
			else if (!(i%2==0)) {
				squareSum = squareSum+(A[i]*A[i]);
			}
		}
		sum = squareSum+cubeSum;
		return sum;
	}
	

	public static void main(String[] args) {
		int A[] = {1,2,3,5};
		System.out.println(solution(A));
	}

}
