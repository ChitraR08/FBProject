package exam;

public class Test5 {

	public static void main(String[] args) {
		// TODO duplicate number in array

		int[] abc = new int[] {101,222,38,102,222,7,8,38,3};
		
		for(int i=0; i<abc.length; i++) {
			for(int j=i+1; j<abc.length; j++) {
				if(abc[i]==abc[j])
					System.out.printf("Duplicate Array:"+abc[j] +"\n");
			}
		}
	}

}
