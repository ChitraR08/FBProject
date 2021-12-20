package exam;

public class Test2 {

	public static void main(String[] args) {
		//Count Total number of Char in String

		String string = "Hi All How is CoreJava Sessions Going on";
		int count = 0;
		
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total number of char :"+count);
	}

}
