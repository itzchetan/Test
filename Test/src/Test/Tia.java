package Test;

public class Tia {

	int costprice, sellingprice, quantity, choc, candy;

	Tia(int cp, int sp, int q, int cc, int cy) {
		costprice = cp;
		sellingprice = sp;
		quantity = q;
		choc = cc;
		candy = cy;

	}

	void Profit() {
		int p = (sellingprice-costprice) * quantity;
		System.out.println("The total profit is: " + p);
	}

	void Loss() {
		int l = costprice * quantity;
		System.out.println("The loss due to damage is: " + l);

	}
	
	void TotalSale() {
		int t=((choc*quantity)+(candy*quantity));
		System.out.println("The toal sale of "+candy+"Candies and "+choc+ "Chocolates is: "+t);
		
	}
}
