package Fresh_Practice;

public class Practice_Var {
	
	int a=10;
	static int b = 20;

	public static void main(String[] args) {
		
		Practice_Var v = new Practice_Var();
		System.out.println(v.a);
		System.out.println(v.b);
		v.a=100;
		v.b=200;
		System.out.println(v.a);
		System.out.println(v.b);
		
		Practice_Var v1= new Practice_Var();
		System.out.println(v1.a);
		System.out.println(v1.b);
		
		String n= "Nitisha Verma";
		String [] sp= n.split(" ");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		
		
	}

}
