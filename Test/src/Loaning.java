/**
 * 
 */

/**
 * @author chetan.dhunna
 *to test the return function in java
 */

public class Loaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For HDFC Bank
		Loan HDFC = new Loan();
		HDFC.period = 1;
		HDFC.principleamount = 100000;
		HDFC.roi = 9.2f;

		System.out.println("The Rate of Interest for HDFC is :" + HDFC.loanamount());
		
		//For SBI Bank
		Loan SBI = new Loan();
		SBI.period=1;
		SBI.principleamount=100000;
		SBI.roi=8.7f;
		System.out.println("The Rate of Interest for SBI is :" + SBI.loanamount());

		// This print statement is for adding paraameters
		System.out.println("The total  in HDFC after bonus of 4556.56 is: "+HDFC.bonus(10.20,230987.07));
		System.out.println("The total in SBI is: "+SBI.bonus(34565.87, 65476.87));
		
	}

}
