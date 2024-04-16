package codingPractice;

public class NthFibonacciNumber {
	
	// Question: To find nth Fibonacci number
	
	public static void main(String[] args) {
		
		int number = 10;
		
		System.out.println(nthFibonacciNumber(number));
	}

	public static int nthFibonacciNumber(int n) {
		
		if (n<=0) {
			return 0;
		}
		else if (n==1 || n==2) {
			return 1;
		}
		else {
			return (nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2));
		}
	}
}
