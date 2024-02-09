package Practice;

public class Code7 {

	public static void main(String[] args) {
		
		String Str = "Test01$$forAutomation03!@";
		Code7 methods = new Code7();
		methods.splitString(Str);
	}

	public void splitString(String str) {
		
		StringBuffer alphabets = new StringBuffer(), 
					   numbers = new StringBuffer(), 
		     specialCharacters = new StringBuffer();
		for (int i=0; i<str.length(); i++) {
			
			if (Character.isAlphabetic(str.charAt(i))) {
				alphabets.append(str.charAt(i));
			}
			else if (Character.isDigit(str.charAt(i))) {
				numbers.append(str.charAt(i));
			}
			else {
				specialCharacters.append(str.charAt(i));
			}
		}
		System.out.println(alphabets);
		System.out.println(numbers);
		System.out.println(specialCharacters);
	}

}
