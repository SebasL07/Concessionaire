package model;

public class GasCar extends Car{
	
	private double tankCapacity;
	private GasType type;
	private double gasConsumption;

	public GasCar(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double tankCapacity, int typeG){

		super(basePrice,sellPrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);
		this.tankCapacity = tankCapacity;

		switch(type){
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
		
	}
}