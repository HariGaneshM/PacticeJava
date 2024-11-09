package Practice;

public class Code10 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for (int i=1;i<=arr.length; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
