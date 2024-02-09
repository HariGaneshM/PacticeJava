package Practice;

public class Code5 {
	
	public static boolean solution(String s) {
		
		int count = 0;
		for (int i=0; i<(s.length()-1); i++) {
			if (s.charAt(i)<=s.charAt(i+1)) {
				count++;
			}
		}
		if (count==(s.length()-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

	public static void main(String[]args) {
		
		String A = "aabbabb";
		System.out.println(solution(A));
	}

}
