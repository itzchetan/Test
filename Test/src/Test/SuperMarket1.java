package Test;

public class SuperMarket1 {
//With Dynamic values assigned to Variables
	int costprice, sellingprice, quantity;

	void Profits1 (int CP, int SP, int Q) {
		costprice = CP;
		sellingprice = SP;
		quantity = Q;

		int P = (sellingprice - costprice) * Q;
		System.out.println("The profit is :" + P);
	}
}
