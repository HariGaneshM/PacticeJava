package codingPractice;

public class ParanthesisChecker {
	
	//Question: To find Valid Parenthesis (whether open parenthesis is properly closed)
	
	public static void main(String[] args) {
		
		String paransString = "{([)}]";
		
		System.out.println(CheckParentheses(paransString));
	}
	
	public static boolean CheckParentheses(String paransString) {
		
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
