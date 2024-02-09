package Practice;

public class Code1 {

	public static int solution(int x) {

		int i = 0, digit, sum = 0;
		int[] arr = new int[10];
		while (x > 0) {
			digit = x % 10;
			if (!(digit % 2 == 0)) {
				arr[i] = arr[i] + digit;
				i++;
			}
			x = x / 10;
		}
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
		}
		if (sum % 2 == 0)
			return -1;
		else
			return 1;
	}

	public static void main(String[] args) {

		int a = 52315, b = 1112;
		System.out.println(solution(a));
		System.out.println(solution(b));
	}

}