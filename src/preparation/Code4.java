package preparation;

public class Code4 {
	
	//Question: To find the longest substring without repeating characters
	
	public static void main(String[] args) {
		
		String mainString = "abaaagbbbbbafttttt";
		
		System.out.println(longestSubStringWithoutRepeation(mainString));
	}
	
	public static String longestSubStringWithoutRepeation(String mainString) {
		
		String subString = "";
		
		for (char ch: mainString.toCharArray()) {
			
			if (!(subString.contains(String.valueOf(ch)))) {
				
				subString = subString+ch;
			}
		}
		
		return subString;
	}
}
