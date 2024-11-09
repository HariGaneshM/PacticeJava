package Practice;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ1 {

	public static void main(String[] args) {
		
		String str1 = "apple banana orange apple grape 1345";
        String str2 = "banana orange orange grape apple 1345";
        String str3 = "grape apple banana orange 1354";
        
        String str = str1+" "+str2+" "+str3;
        
        String[] strArr = str.split(" ");
        
        Map<String,Integer> map = new HashMap<>();
        
        for (int i=0; i<strArr.length; i++) {
        	int count = 0;
        	for (int j=0; j<strArr.length; j++) {
        		if (strArr[j].equals(strArr[i])) {
            		count++;
            	}
        	}
        	map.put(strArr[i], count);
        }
        System.out.println(map.toString());
	}
}

//Repetitive words and their counts:
//apple: 4
//banana: 3
//orange: 4
//grape: 3
