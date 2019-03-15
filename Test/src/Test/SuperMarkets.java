package Test;

public class SuperMarkets {
//Storing and Accessing Instance Variables of an Object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarket BigBazaar = new SuperMarket();
		SuperMarket Reliance = new SuperMarket();

		BigBazaar.costprice = 234;
		BigBazaar.sellingprice = 453;
		BigBazaar.quantity = 4567;
		BigBazaar.Profit();

		Reliance.costprice = 465;
		Reliance.quantity = 3456;
		Reliance.sellingprice= 987;
		
		Reliance.damage();
		Reliance.Profit();
		
	}

}
