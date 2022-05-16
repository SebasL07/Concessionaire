package model;

public class GasCar extends Car{
	
	private double tankCapacity;
	private GasType type;
	private double gasConsumption;

	public GasCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double tankCapacity, int typeG){

		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);
		this.tankCapacity = tankCapacity;
		gasConsumption = 0;
		

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
	public double calculateSalePrice(){
		return 0.0;
	}

	@Override
	public String toString(){
		return super.toString() + "\n" + "Capacidad del tanque: " + tankCapacity + "\n" + "Tipo de gasolina: " + type + "\n" + "Consumo de gasolina: " + gasConsumption + "\n";
	}

	@Override
	public void calculateConsumption(){

		gasConsumption = tankCapacity * (super.getCylinderCapacity()/150);
	}


}