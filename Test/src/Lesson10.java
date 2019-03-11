
public class Lesson10 {
	//Constructer exmaple

	int principleamount;
	int period;
	float roi;
	
	Lesson10 (int pa, int p, float r){ //This is a constructer
		principleamount=pa;
		period= p;
		roi =r;
		
	}
	float loanamount() {
		float Rate = roi / 100;
		float total = (principleamount * period * Rate);
		return total;
	}
	
	double bonus(double dep, double bal) {// Adding parameters to method
		return (dep+bal);
	}
}
