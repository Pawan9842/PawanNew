package Fresh_Practice;

public class Digit_Count {

	public static void main(String[] args) {
		
		int a=474; int t=a;
		int count=0;
		int rev=0;  //4 7 4
		int rem;
		while(t!=0) {
			rem=t%10; //4%10= 4
			rev=rev*10+rem;  //47*10+4=474
			t=t/10;   //4/10= 0
			count=count+1;  //1+1+1
		}
		System.out.println(count);
		
	}

}
