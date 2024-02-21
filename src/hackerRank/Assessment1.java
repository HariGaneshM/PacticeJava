package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Assessment1 {

	public static void main(String[] args) {
		
		int k=3;
		int[] intArray = {3, 5, -1, -4, 9, 16};
		List<Integer> intList = loadList(intArray);
		System.out.println(solution(intList, k));
	}
	
	public static List<Integer> loadList(int[] intArray) {
		
		List<Integer> arrList = new ArrayList<Integer>();
		for (int i=0; i<intArray.length; i++) {
			
			arrList.add(intArray[i]);
		}
		return arrList;
	}
	
	public static int solution(List<Integer> intList, int k) {
		
		int maxSum = 0;
		for (int i=0; i<k; i++) {
			int a = 0+i;
			int sum = intList.get(i);
			for (int j=0; j<intList.size(); j++) {
				a = a+k;
				if (a >= intList.size()) {
					break;
				}
				else {
					
					sum = sum+intList.get(a);
				}
			}
			if (maxSum<sum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}
}
