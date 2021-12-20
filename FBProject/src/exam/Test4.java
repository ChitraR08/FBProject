package exam;

public class Test4 {

	public static void main(String[] args) {
		// TODO Reverse String
		
		String string = "Selenium Automation";
		System.out.println("Original String :"+string);
		
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.printf("\nReverse String :"+reverse);
	}

}
