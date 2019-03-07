package Package2;

public class Vehicle2 {
	String number;
	String type;
	String Model;

	Vehicle2() {
		number = "MH02CD4884";
		type = "SUV";
		Model = "CAR";
		
		this.displayVehicle2(this);
	}

	void displayVehicle() {
		System.out.println(this.number + "::" + this.type + "::" + this.Model);
	}

	void displayVehicle2(Vehicle2 vehicle) {
		System.out.println(vehicle.number + "::" + vehicle.type + "::" + vehicle.Model);
	}
	
	Vehicle2(String number, String type, String Model) {
		
		this.number = number;// this is used to identify instance variable
		this.type = type;
		this.Model = Model;
		this.displayVehicle2(this);

	}

	Vehicle2(String type, String Model) {
		this();// this will call default value of Vehicle
		this.type = type;
		this.Model = Model;
		this.displayVehicle2(this);
	}
Vehicle2(Vehicle vehicle){// To pass an argument in constructor
	this.number= vehicle.number;
	this.Model = vehicle.Model;
	this.type = vehicle.type;
	this.displayVehicle2(this);
}
}

