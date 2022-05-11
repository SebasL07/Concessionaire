package model;

public class ElectricCar extends Car{
	
	private ChargerType cType;
	private double batteryDuration;
	private double batteryConsumption;

	public ElectricCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double batteryDuration, int typeE){
		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);

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