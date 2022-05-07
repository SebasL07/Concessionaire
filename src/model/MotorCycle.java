package model;

public class MotorCycle extends Vehicle{
	private MotoType mType;
	private double tankCapacity;
	private double gasConsumption;

	public MotorCycle(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, boolean wasUsed, String licensePlate){
		super(basePrice,sellPrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);	
	}

	
}