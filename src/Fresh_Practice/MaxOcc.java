package Fresh_Practice;

public class MaxOcc {

	public static void main(String[] args) {
		String s1="Pawaaan";
		int [] a=new int[127];
		for(int i=0;i<s1.length();i++) {
			a[s1.charAt(i)]=a[s1.charAt(i)]+1;
	}
		int m=-1;
		char ch=' ';
		for(int i=0;i<s1.length();i++) {

			if(m<a[s1.charAt(i)]) {
				m=a[s1.charAt(i)];
				ch=s1.charAt(i);
			}		
		}
			
		System.out.println("The character that has occured max time is "+ch);
	}

}
