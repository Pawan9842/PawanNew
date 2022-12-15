package Fresh_Practice;

public class NewStrings {

	public static void main(String[] args) {
		
		String s1="String";
		System.out.println(s1);
		String s2="I am scared of doctors";
		String [] a=s2.split(" ");
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		String s3=new String("HoneyMoon");
		String s4=new String("HoneyMoon");       //scp=1    heap=1+1
		
		System.out.println(s3==s4);
		String s5="HoneyMoon";
		System.out.println(s4==s5);
		String s6="HoneyMoon";
		System.out.println(s5==s6);
		System.out.println(s3.equals(s5));
		System.out.println(s3.equals(s4));
		String [] b=s6.split("o");
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		String s7="Honey";
		System.out.println(s7+"moon");
		System.out.println(s7.concat("w"));
		System.out.println(s7+19);
		System.out.println(s7+12+12);
		System.out.println(19+s7);
		System.out.println(s7+2/4);
		System.out.println(s7+2%4);
		System.out.println(12+2+s7);
		System.out.println(s7+3*3);
		
		
		System.out.println(s7.subSequence(1, 3));
		System.out.println(s7.substring(3));
		System.out.println(String.join("123", s5,s6,s7));
		
		
		System.out.println(s5.indexOf("o"));
		System.out.println(s5.lastIndexOf("o"));
		
	}

}
