
public class Banks {
	 
		int accnumber;
		int balance;
		int deposit;
		int withdraw;
		String Acconame;

		void profit() {

			int total = (balance + deposit) - withdraw;
	System.out.println("The total amount in user account " + Acconame+ " is :"+total);
		}

		
	}


