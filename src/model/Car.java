package model;

public abstract class Car extends Vehicle{
	
	private int numDoors;
	private boolean tintedWindows;
	private CarType type;

	public Car(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type){

		super(basePrice,sellPrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate);
		this.numDoors = numDoors;
		this.tintedWindows = tintedWindows;

		switch(type){
		case 1:
			this.type = CarType.SEDAN;
			break;
		case 2: 
			this.type = CarType.PICKUP;
			break;
		}
	}
}