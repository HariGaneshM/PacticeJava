package codingPractice;

public class SumOfIntergerArray {
	
	//Question: To Sum integers in an Array
	
	public static void main(String[] args) {
		
		Integer[] intArr = {1,2,3,4,5,6,8,9};
		
		int sum = sumIntegerArray(intArr);
		System.out.println(sum);
	}

	public static int sumIntegerArray(Integer[] intArr) {
		
		int sum =0;
		for (int i: intArr) {
			
			sum = sum+i;
		}
		
		return sum;
	}

}
