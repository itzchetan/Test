package Test;

public class SuperMarket2 {
	int costprice, sellingprice, quantity;
	
	
	SuperMarket2(int CP, int SP, int Q){// With Constructer
		costprice = CP;
		sellingprice = SP;
		quantity = Q;
		
	}
	
	void Profit() {
		int p= (sellingprice-costprice)*quantity;
		System.out.println("The Profit is:"+p);
		
	}
	
	void Loss() {
		int l= costprice*quantity;
		System.out.println("The loss is:"+l);
	}
}
