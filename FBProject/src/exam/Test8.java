package exam;

import java.sql.Timestamp;
import java.util.Date;

public class Test8 {

	public static void main(String[] args) {
		// TODO Convert Date to Timestamp
		
		Date d = new Date();
		System.out.println("Current Date : "+d);
		Timestamp ts = new Timestamp(d.getTime());
		System.out.println("Convert Date to Timestamp:"+ts);
	}

}
