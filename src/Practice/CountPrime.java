package Practice;

public class CountPrime {
	public static int totalPrime(int a, int b) {
		int count=0;
		for (int i=a; i<=b; i++){
			int temp=0;
			for (int j=2; j<i; j++){
				if (i%j==0){
					temp++;
				}
			}
			if (temp==0){
				count++;
			}
		}
		return count;
	}
}
