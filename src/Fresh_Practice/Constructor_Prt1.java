package Fresh_Practice;

public class Constructor_Prt1 {
	
	String place;
	String name1;
	String name2;
	int date;
	String month;
	static String train="Rajdhani Express";
	
	Constructor_Prt1(String name1, String place, String name2, int date, String month, String train) {
		this.place=place;
		this.name1=name1;
		this.name2=name2;
		this.date=date;
		this.month=month;
		System.out.println(name1+" is going to "+place+" with "+name2+" on "+date+" "+month+" in "+train);
		
	}
	 
	public static void main(String[] args) {
		
		Constructor_Prt1 c1=new Constructor_Prt1("Pawan","Nainital","Rachel",13,"December",train);
		Constructor_Prt1 c2=new Constructor_Prt1("Pawan","Ladhak","Penny",23,"January",train);
		
		
	}

}
