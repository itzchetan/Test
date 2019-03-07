package tutorial01vol3;

public class Groceries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery houstonStore = new Grocery();
		Grocery seattleStore = new Grocery();
		Grocery orlandoStore = new Grocery();
		
		

		houstonStore.AppleSoldPerYear = 43;
		houstonStore.RetailPricePerApple = 0.99;
		houstonStore.OrangeSoldPerYear = 100;
		houstonStore.RetailPricePerOrange = 0.87;

		System.out.println("Houston");
		System.out.println("\nThe apples sold per year in houston is :" + houstonStore.AppleSoldPerYear);

		
		houstonStore.revenueApple();
		houstonStore.revenueOrange();
		
		seattleStore.revenueApple();
		
	}

	
}
