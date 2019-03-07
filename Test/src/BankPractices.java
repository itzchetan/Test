
public class BankPractices {
	//this Exapmle is to learn return.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankPractice ICICI = new BankPractice();

		ICICI.accnumber = 110023456;
		ICICI.balance = 230000;
		ICICI.deposit = 3452345;
		ICICI.withdraw = 45678;
		ICICI.Acconame = "CHETAN SINGH DHUNNA";
		
		System.out.println("For ICICI BANK: "+ICICI.profit());
	
		
		BankPractice HDFC = new BankPractice();

		HDFC.accnumber = 5098765;
		HDFC.deposit = 345678;
		HDFC.withdraw = 3443;
		HDFC.balance = 456789;
		HDFC.Acconame = "CHETAN SINGH HDFC";

		System.out.println("For HDFC BANK: "+HDFC.profit());
		
	}

}
