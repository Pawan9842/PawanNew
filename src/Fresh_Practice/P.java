package Fresh_Practice;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		
		
		for(int i=0; i<5; i++) {
		Scanner sc =new Scanner(System.in);  // keyboard action
		System.out.println("Enter a Number");
		int no=sc.nextInt();
//		int no=1234321;   //1230+4
		int t=no;
		int rem;
		int rev=0;
		while(t!=0) {     //12
			rem=t%10;   //1%10=1
			rev=rev*10+rem;  //4320+1=4321
			t=t/10;//1/10=0
		}
		if(rev==no) {
			System.out.println(no+" is Palindrome");
		}
		else {
			System.out.println(no+" is not Palindrome");
		}
		
	}
		
	}

}
