
public class Lessons10 {
//Example for Constructer
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson10 HDFC = new Lesson10(1000,1,(float)10.0);
		Lesson10 SBI = new Lesson10(2000,1,(float)10.2);
	
	System.out.println("The In for HDFC is :"+HDFC.loanamount());
	System.out.println("The Interest for SBI is "+SBI.loanamount());
	System.out.println("The Bonus amount in HDFC for deposit of 150 is "+HDFC.bonus(150,200));
	
	
	}
}
	
