package preparation;

public class Code5 {
	
	//Question: To find Valid Parentheses (whether open paranthesis is properly closed)
	
	public static void main(String[] args) {
		
		String paransString = "{([)}]";
		
		System.out.println(ParenthesesChecker(paransString));
	}
	
	public static boolean ParenthesesChecker(String paransString) {
		
		int balance = 0;
		for (char ch: paransString.toCharArray()) {
			
			if (ch == '(' || ch == '{' || ch == '[') {
				balance++;
			}
			else if (ch == ')' || ch == '}' || ch == ']') {
				balance--;
			}
			if (balance<0) {
				return false;
			}
		}
		return balance==0;
	}
}
