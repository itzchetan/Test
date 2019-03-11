/**
 * 
 */

/**
 * @author chetan.dhunna
 *
 */
public class Loan {
	int principleamount;
	int period;
	float roi;

	float loanamount() {// loanamount method is created

		float Rate = roi / 100;
		float total = (principleamount * period * Rate);
		return total;

	}

	double bonus(double dep, double bal) {// Adding parameters to method
		return (dep+bal);
	}
}
