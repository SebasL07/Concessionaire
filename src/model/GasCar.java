package model;

public class GasCar extends Car implements IFuel{
	
	private double tankCapacity;
	private GasType type;
	private double gasConsumption;

	public GasCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double tankCapacity, int typeG){

		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);
		this.tankCapacity = tankCapacity;
		gasConsumption = 0;
		calculateSalePrice();
		calculateConsumption();


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
	public void calculateSalePrice(){
		
		double sellPrice = 0;

		if(documents[0] == null || documents[1].getYear() != 2022){
			sellPrice = super.getBasePrice() + 500000; 
		} else{
			sellPrice = super.getBasePrice();
		}

		if(super.getWasUsed()){
			sellPrice = super.getBasePrice() - (super.getBasePrice()*0.10);
		}
		
		super.setSellPrice(sellPrice);
	}

	@Override
	public String toString(){
		return super.toString() + "\n" + "Capacidad del tanque: " + tankCapacity + "\n" + "Tipo de gasolina: " + type + "\n" + "Consumo de gasolina: " + gasConsumption + "\n";
	}

	@Override
	public void calculateConsumption(){

		gasConsumption = tankCapacity * (super.getCylinderCapacity()/150);
	}
	@Override
	public GasType getGasType(){
		return type;
	}


}