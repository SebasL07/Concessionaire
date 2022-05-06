package model;

public class ElectricCar extends Car{
	
	private ChargerType cType;
	private double batteryDuration;
	private double batteryConsumption;

	public ElectricCar(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double batteryDuration, int typeE){
		super(basePrice,sellPrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);

		this.batteryDuration = batteryDuration;

		switch(typeE){
			case 1:
				this.cType = ChargerType.NORMAL;
				break;
			case 2:  
				this.cType = ChargerType.FAST;
				break;
		}
	}
}