package model;

public class ElectricCar extends Car{
	
	private ChargerType cType;
	private double batteryDuration;
	private double batteryConsumption;

	public ElectricCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double batteryDuration, int typeE){
		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type);

		this.batteryDuration = batteryDuration;
		batteryConsumption = 0;
		calculateSalePrice();
		calculateConsumption();

		switch(typeE){
			case 1:
				this.cType = ChargerType.NORMAL;
				break;
			case 2:  
				this.cType = ChargerType.FAST;
				break;
		}
	}

	@Override
	public String toString(){
		return super.toString() + "\n" +
		"Capacidad de la bateria: " + batteryDuration + "\n" +
		"Tipo de cargador: " + cType + "\n" +
		"Consumo de la bateria: " + batteryConsumption + "\n";
	}

	@Override
	public void calculateSalePrice(){
		double sellPrice = 0;

		if(documents[0] == null || documents[1].getYear() != 2022){
			sellPrice = super.getBasePrice() + 500000; 
		} 

		sellPrice = super.getBasePrice() + (super.getBasePrice()*0.20);

		if(super.getWasUsed()){
			sellPrice = super.getBasePrice() - (super.getBasePrice()*0.10);
		}
		
		super.setSellPrice(sellPrice);
	}

	@Override
	public void calculateConsumption(){
		
		if(cType == ChargerType.FAST){
			batteryConsumption = (batteryDuration+13)*(super.getCylinderCapacity()/100);
		} else if(cType == ChargerType.NORMAL){
			batteryConsumption = (batteryDuration+18)*(super.getCylinderCapacity()/100);
		}
	}
}