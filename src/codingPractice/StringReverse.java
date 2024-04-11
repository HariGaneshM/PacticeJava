package codingPractice;

public class StringReverse {
	
	//Question: To reverse a String without using a direct method
	
	public static void main(String[] args) {
		
		String mainString = "Coding Assessment";
		
		System.out.println(reverseString(mainString));
	}
	
	public static String reverseString(String givenString) {
		
		char[] charArr = givenString.toCharArray();
		String reversedString = "";
		
		for (int i=1; i<=charArr.length; i++) {
			
			reversedString=reversedString+charArr[charArr.length-i];
		}
		
		return reversedString;
	}
}
