
public class BankPractice {
	int accnumber;
	int balance;
	int deposit;
	int withdraw;
	String Acconame;

	int profit() {

		int total = (balance + deposit) - withdraw;
		return total;

	}
}
