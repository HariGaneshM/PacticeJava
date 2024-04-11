package codingPractice;

import java.util.ArrayList;
import java.util.List;

public class RemoveValueFromArray {
	
	//Question: To remove given element or value from array
	
	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5,6,3,7,8,9,3};
		int value = 3;
		
		removeValueFromArray(intArr, value);
	}

	public static void removeValueFromArray(int[] intArr, int value) {
		
		List<Integer> intList = new ArrayList<>();
		
		for (int i: intArr) {
			
			if (!(value == i)) {
				intList.add(i);
			}
		}
		printValues(intList);
	}

	public static void printValues(List<Integer> intList) {
		
		for (int k: intList) {
			System.out.print(k+",");
		}
	}

}
