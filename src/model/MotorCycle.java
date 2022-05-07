package model;

public class MotorCycle extends Vehicle{
	private MotoType mType;
	private double tankCapacity;
	private double gasConsumption;

	public MotorCycle(double basePrice, String brand, String model, double cylinderCapacity,double mileage, boolean wasUsed, String licensePlate){
		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);	
	}

	
}