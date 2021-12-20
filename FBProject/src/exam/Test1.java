package exam;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {

	public static void main(String[] args) {
		// sorts array elements in alphabetical descending order

		String strarray[]= {"Harish","Ram","SummitWork","Sreenivas","Selenium","Automation"};
        System.out.printf("Original Array: \n%s\n\n", Arrays.toString(strarray));

        Arrays.sort(strarray,Collections.reverseOrder());
		System.out.printf("Array sorted in descending order : \n%s\n\n",Arrays.toString(strarray));
	}

}
