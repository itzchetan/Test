package Test;

public class SuperMarket {
	//Storing and Accessing Instance Variables of an Object

	int costprice, sellingprice, quantity;

	void Profit() {
		int p = (sellingprice - costprice) * quantity;
		System.out.println("The profit is:" + p);

	}
void damage() {
	int l=costprice * quantity;
	System.out.println("The loss is:"+l);
}
}
