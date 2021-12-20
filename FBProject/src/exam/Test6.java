package exam;

public class Test6 {

	public static void main(String[] args) {
		// TODO odd-even in array
		
		int a[]={15,2,5,6,3,2,15};  
				for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println("Odd Number :"+a[i]);
			}
		}
		for(int j=0; j<a.length;j++) {
			if(a[j]%2==0) {
				System.out.println("Even Number:"+a[j]);
			}
		}

	}

}
