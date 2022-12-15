package Fresh_Practice;

import java.util.Scanner;

public class Switchh_Pr1 {

	public static void main(String[] args) throws Exception {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Alphabet");
		char alpha= s.next().charAt(0);
		
		Thread.sleep(4000);
		
		switch(alpha) {
		
		case'a': System.out.println(alpha+" is a Vowel");
				 break;
		
		case'e': System.out.println(alpha+" is a Vowel");
				 break;
				 
		case'i': System.out.println(alpha+" is a Vowel");	
				 break;
		
		case'o': System.out.println(alpha+" is a Vowel");
				 break;
				 
		case'u': System.out.println(alpha+" is a Vowel");
				 break;
				 
		case'A': System.out.println(alpha+" is a Vowel");
				 break;

		case'E': System.out.println(alpha+" is a Vowel");
				 break;
		 
		case'I': System.out.println(alpha+" is a Vowel");	
				 break;

		case'O': System.out.println(alpha+" is a Vowel");
				 break;
		 
		case'U': System.out.println(alpha+" is a Vowel");
				 break;		 
				 
		default: System.out.println(alpha+" is a Consonant");		 
		}
		
				
	}

}
