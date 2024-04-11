package codingPractice;

public class StringWordsReverse {
	
	//Question: To reverse words in a string
	
	public static void main(String[] args) {
		
		String sentence = "My name is Hari Ganesh Malla";
		String reverse = reverseWordsInString(sentence);
		System.out.println(reverse);
	}

	public static String reverseWordsInString(String sentence) {
		
		String[] words = sentence.split(" ");
		String reverseSentance = "";
		
		for (int i=1; i<=words.length ; i++) {
			
			reverseSentance = reverseSentance+words[words.length-i]+" ";
		}
		return reverseSentance.trim();
	}

}
