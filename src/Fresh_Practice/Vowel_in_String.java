package Fresh_Practice;

import java.util.Scanner;

public class Vowel_in_String {
	
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		
//		String s = "pawan";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String s=sc.next();
		int vowelcount=0;
		char ch=' ';
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == 'a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				vowelcount=vowelcount+1;
				ch=s.charAt(i);
			}	
		}
//		if(ch=='a')
		System.out.println("There are "+vowelcount+" vowels in "+s);
		
		System.out.println(b);
		Vowel_in_String v= new Vowel_in_String();
		System.out.println(Vowel_in_String.b);
		v.a=78;
		v.b=56;
		System.out.println(v.a);
		System.out.println(b);
		
		Vowel_in_String v1=new Vowel_in_String();
		System.out.println(v1.a);
		System.out.println(v1.b);
	}

}
