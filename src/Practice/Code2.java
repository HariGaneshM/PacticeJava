package Practice;

public class Code2 {
		
	public static int countOnBits(int num) {
		
		String binaryNum = Integer.toBinaryString(num);
		int count = 0;
		char k;
		for (int i=0; i<binaryNum.length(); i++) {
			k = binaryNum.charAt(i);
			if (k=='1') {
				count++;
			}
		}
		return count;
	}
		
	public static void main(String[] args) {
		
	int a=9456;
	System.out.println(countOnBits(a));
	
	}
}