package exam;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO to sort in array
		
		int[] array = new int[] {90,23,5,109,12,22,67,34};
		 System.out.printf("Original Array: %s", Arrays.toString(array)); 
        Arrays.sort(array); 
        System.out.printf("\n\nSorted Array: %s", Arrays.toString(array)); 
	}

}
