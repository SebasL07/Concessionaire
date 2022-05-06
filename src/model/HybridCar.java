package model;

public class HybridCar extends Car{
	
	private double tankCapacity;
	private GasType gType;
	private double gasConsumption;
	private ChargerType cType;
	private double batteryDuration;
	private double batteryConsumption;

	public HybridCar(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int typeC,double tankCapacity, int typeG, double batteryDuration, int typeE){
		super(basePrice,sellPrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,typeC);

		this.tankCapacity = tankCapacity;

		switch(typeG){
		case 1: 
			this.type = GasType.NORMAL;
			break;
		case 2: 
			this.type = GasType.EXTRA;
			break;

		case 3: 

			this.type = GasType.DIESEL;
			break;
		}


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