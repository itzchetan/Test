
public class Watch {
	int costprice;
	String Brand;
	int sellingprice;
	int quantity;

	Watch(int cp, String Br, int sp, int q) { // This is my Constructer
		costprice = cp;
		Brand = Br;
		quantity = q;
		sellingprice = sp;

	}

	int profits () {
	 return(sellingprice-costprice)*quantity;
	 
	 
 }

}
