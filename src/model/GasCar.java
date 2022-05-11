package model;

public class GasCar extends Car{
	
	private double tankCapacity;
	private GasType type;
	private double gasConsumption;

	public GasCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double tankCapacity, int typeG){

		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);
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
		
	}

	@Override
	public double calculateSalePrice
}