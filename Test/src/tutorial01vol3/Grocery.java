package tutorial01vol3;

public class Grocery {
	int AppleSoldPerYear;
	double RetailPricePerApple;

	int OrangeSoldPerYear;
	double RetailPricePerOrange;

	void revenueApple() {
		double profit;
		profit = AppleSoldPerYear * RetailPricePerApple;
		System.out.println("The revenue of Apples is : " + profit);
	}

	void revenueOrange() {
		double profit;
		profit = OrangeSoldPerYear * RetailPricePerOrange;
		System.out.println("The revenue of Oranges is : " + profit);
	}
}