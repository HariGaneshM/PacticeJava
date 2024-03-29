package preparation;

public class Code1 { 
	
	//Question: To find the frequency of one string in another string

	public static void main(String[] args) {
		
		String mainString = "Hi, I am a coding tutor and here to answer few coding questions";
		String singleWord = "Coding";
		
		int frequency = checkFrequeny(singleWord, mainString);
		System.out.println(frequency);
	}
	
	public static int checkFrequeny(String subString, String mainString) {
		
		String[] mainStringWords = mainString.split(" ");
		int count = 0;
		for (String word: mainStringWords) {
			if (word.equalsIgnoreCase(subString)) {
				count++;
			}
		}
		return count;
	}
}
