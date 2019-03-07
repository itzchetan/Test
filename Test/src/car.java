
public class car {
	int wheels;
	int seats;
	int gears;
	String CarName;
	String ModelName;
	static String Make ; // it will be available for all objects
	// now

	car(car maruti) { // constructer with fixed values
		wheels = 4;
		seats = 5;
		gears = 5;
		CarName = "Hyundai";
		ModelName = "Santro";
		System.out.println("Car Name: " + CarName + "\nCar Model: " + ModelName);
	}

	car(int tyres, int passengers, int transmission) { // Constructer with dynamic values
		wheels = tyres;
		seats = passengers;
		gears = transmission;
	}

	car(int tyres, int passengers) { // Constructer with dynamic and static values
		wheels = tyres;
		seats = passengers;
		gears = 6;

	}

	void car1() { // method

		wheels = 4;
		seats = 5;
		gears = 5;
		CarName = "Hyundai";
		ModelName = "Santro";
		System.out.println("Car Name: " + CarName + "\nCar Model: " + ModelName);
	}

	void car2(int tyres, int passengers, int transmission) { // parameterised metheod
		wheels = tyres;
		seats = passengers;
		gears = transmission;

	}

	void displayCar() { // method
		System.out.println("Wheels:" + wheels + "\nSeats:" + seats + "\nGears: " + gears+ "\n"+Make);
	}

	static void initializeMake() {
		Make = "Manufacture";

	}

	static {
	Make ="Manufacture";  // when we use static we dont have to initialise car.initializeMake(); in the program
	System.out.println("This is to show static block"); // this print statement is used to check if this is executed.
}
	
	{
		System.out.println("This is to show  block"); // this wil be called with all objects.
	}
	}
