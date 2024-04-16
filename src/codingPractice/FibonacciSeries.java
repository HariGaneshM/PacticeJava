package codingPractice;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
	
	// Question: To  Fibonacci number
	
	public static void main(String[] args) {
		
		int number = 10;
		
		List<Integer> fibSeries = fibonacciSeries(number);
		
		for (int f: fibSeries) {
			System.out.println(f);
		}
	}

	public static List<Integer> fibonacciSeries(int n) {
		
		List<Integer> fibSeries = new ArrayList<Integer>();
		fibSeries.add(0);
		fibSeries.add(1);
		for (int i=2; i<=n; i++) {
			fibSeries.add(fibSeries.get(i-1)+fibSeries.get(i-2));
		}
		return fibSeries;
	}
}
