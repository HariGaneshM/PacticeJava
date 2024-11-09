package Practice;

import java.util.Arrays;

public class Code12 {

	public static void main(String[] args) {
		
		int num = 4351;
		char[] charArr = (Integer.toString(num)).toCharArray();
		Arrays.sort(charArr);
		String finalNum = "";
		
		for(char c: charArr) {
		finalNum = finalNum+c;
		}
		System.out.println(finalNum);
	}

}
