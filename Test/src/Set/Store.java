package Set;

public class Store {
	int Mars;
	int Kisses;
	int Buttercups;

	void totalSale() {
		
		int totalsale = (Mars  + Kisses +Buttercups);
		System.out.println("The total sale of Chocolatesin INR is:" + totalsale);

	}

	int sale (int m, int k, int b) {
		Mars = m;
		Kisses = k;
		Buttercups = b;
		return(m+k+b);
	
	}

	

	}
