
public class Mobile {

	String Company = "iphone";
	int series;
	int Cost;

	void displayMobile() {
		System.out.println("This mobile is from :" + "Comapny");
	}

	void defaultMobile() {

		int series = 4;
		int Cost = 1000;
		System.out.println("The series is:" + series + "\nCost is :" + Cost);

	}

	void initialiseMobile(int Model, int Price) {
		series = Model;
		Cost = Price;
		System.out.println("This is for Cost to show in Initialise:" + Price + "\nModel:" + Model);
	}

	{
		System.out.println("Static Block");
	}
	Mobile() {
		
	}
	
	
	Mobile(Mobile iphones) {
		int series = 4;
		int Cost = 1000;
		String Mobile = "Iphone";
		System.out.println("\nPrinting with Constructer" + "The series is:" + series + "\nCost is :" + Cost
				+ "\nMobile is:" + Mobile);
	}
	
	Mobile (int Model, int Price, int ram ){
		series = Model;
		Cost = Price;
		ram =4; 
		System.out.println("Constructer with to show in Initialise:" + Price + "\nModel:" + Model+"\nRam is :"+ram);
	}
}
