
public class Vehicle {

	int tyres;
	int gear;
	int passengers;
	String Type;
	String Colour;

	void display() {

		tyres = 4;
		gear = 6;
		passengers = 5;
		Type = "Car";
		Colour = "Red";
		System.out.println("Tyre:" + tyres + "\n Number of Gears:" + gear + "\nNumber of passengesr:" + passengers
				+ "\nType:" + "Car" + "\n Colour is :" + "Red");

	}

	void initializeCar(int wheels, int transmission, int people, String variation) {
		tyres = wheels;
		gear = transmission;
		passengers = people;
		Type = variation;
	}

	void show() {
		System.out.println("Tyre:" + tyres + "\n Number of Gears:" + gear + "\nNumber of passengesr:" + passengers
				+ "\nType:" + Type);

	}

	Vehicle() {
		tyres = 8;
		gear = 6;
		passengers = 1;
	}

	Vehicle(int wheels, int transmission) {
		tyres = wheels;
		gear = transmission;
		passengers = 1;
	}

	static {
		System.out.println("This is to show static block");
	}

	{
		System.out.println("This would be printed with all blocks");
	}
}
