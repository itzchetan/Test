package Package2;

public class Vehicle {
	String number;
	String type;
	String Model;

	Vehicle() {
		number = "MH02CD4884";
		type = "SUV";
		Model = "CAR";
		this.displayVehicle2(this);
	}

	Vehicle(String number) {//To pass an argument in constructor
		this.number = number;
		Vehicle2 vehicle2 = new Vehicle2(this);
	}

	void displayVehicle() {
		System.out.println(this.number + "::" + this.type + "::" + this.Model);
	}

	void displayVehicle2(Vehicle vehicle) {
		System.out.println(vehicle.number + "::" + vehicle.type + "::" + vehicle.Model);
	}

	Vehicle(String number, String type, String Model) {

		this.number = number;// this is used to identify instance variable
		this.type = type;
		this.Model = Model;
		this.displayVehicle2(this);

	}

	Vehicle(String type, String Model) {
		this();// this will call default value of Vehicle
		this.type = type;
		this.Model = Model;
		this.displayVehicle2(this);
	}
	
	Vehicle returnVehicle() {
		return this;
		
	}
}
