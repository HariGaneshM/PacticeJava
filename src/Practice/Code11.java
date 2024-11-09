package Practice;

public class Code11 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int i=0; i<arr.length; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(arr[i]);
		}
	}

}
