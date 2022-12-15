package Fresh_Practice;

public class LocalVariables {
	
	public int a=10;
	private int b=20;
	final int d=40;
	static int s=40;

	public static void main(String[] args) {
		
//		public int c=30;    // Illegal modifier for parameter c; only final is permitted
		                    // We get the above error
							// We cannot use any access modifier with the local variables
		final int e=30;
		System.out.println(s);
		LocalVariables l=new LocalVariables();
		System.out.println(l.s);
		System.out.println(l.d);
		System.out.println(l.a);
		
		
	}

}
