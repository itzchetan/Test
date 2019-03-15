package Test;

public class Priv {
	int costprice, profit;
	int sellingprice, quantity;

	Priv(int cp, int sp, int q) {
		costprice = cp;
		sellingprice = sp;
		quantity = q;

	}

	int profits() {
		return (sellingprice - costprice) * quantity;
	}

	void SetNewValues(int c,  int s) {
				
		int xx=c+s;
		
		
		if (xx < 1000)
		{
			
			System.out.println("The profilt can be logged as:" + xx);
		}
		else {
			System.out.println("The profit cannot be logged");
		}
	}
}
