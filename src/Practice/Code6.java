package Practice;

public class Code6 {
	
	public static int sumLimit(int a, int b) {
		
		int sum = a+b;
		String A = String.valueOf(a);
		String Sum = String.valueOf(sum);
		if (Sum.length()==A.length()) {
			return sum;
		}
		else {
			return a;
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(sumLimit(2, 3));
		System.out.println(sumLimit(8, 3));
		System.out.println(sumLimit(8, 1));
	}

}
