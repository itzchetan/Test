
public class Sweet {
	int costprice;
	int sellingprice;
	int quantity;

	void display() {
		System.out.println("The Sweet shop sold " + quantity + " Chocolates");
	}

	Sweet(int cp, int sp) {
		costprice = cp;
		sellingprice = sp;
	}

	int profit() {
		return (sellingprice - costprice);

	}

}
