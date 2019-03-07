package tutorial01vol3;

public class MyBanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banks ICICI = new Banks();

		ICICI.accnumber = 110023456;
		ICICI.balance = 230000;
		ICICI.deposit = 3452345;
		ICICI.withdraw = 45678;
		ICICI.Acconame = "CHETAN SINGH DHUNNA";
		System.out.println("For ICICI BANK");
		ICICI.profit();
		
		Banks HDFC = new Banks();

		HDFC.accnumber = 5098765;
		HDFC.deposit = 345678;
		HDFC.withdraw = 3443;
		HDFC.balance = 456789;
		HDFC.Acconame = "CHETAN SINGH HDFC";

		System.out.println("For HDFC BANK");
		HDFC.profit();

		// Banks SBI = new Banks();

	}

}
