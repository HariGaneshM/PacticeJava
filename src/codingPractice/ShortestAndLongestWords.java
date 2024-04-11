package codingPractice;

public class ShortestAndLongestWords {

	//Question: To find Shortest and Longest Words in a String
	
	public static void main(String[] args) {
		
		String mainString = "Hi, I am a coding tutor and here to answer few coding questions";
		
		shortestAndLongestWords(mainString);
	}
	
	public static void shortestAndLongestWords(String mainString) {
		
		String[] mainStringWords = mainString.split(" ");
		String shortestString = mainStringWords[0];
		String longestString = mainStringWords[0];
		
		for (String word: mainStringWords) {
			
			if (word.length()<shortestString.length()) {
				shortestString = word;
			}
			if (word.length()>longestString.length()) {
				longestString = word;
			}
		}
		System.out.println("Shortest word is "+shortestString);
		System.out.println("Longest word is "+longestString);
	}
}
