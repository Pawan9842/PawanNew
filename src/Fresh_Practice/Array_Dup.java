package Fresh_Practice;

public class Array_Dup {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,3,4,5};
		for(int i=0; i<a.length; i++) {
			if(a[i]==3) {
				continue;
			}
			System.out.println(a[i]);
		}
		
	}

}
