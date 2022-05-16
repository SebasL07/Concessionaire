package model;

public class HybridCar extends Car{
	
	private double tankCapacity;
	private GasType gType;
	private double gasConsumption;
	private ChargerType cType;
	private double batteryDuration;
	private double batteryConsumption;

	public HybridCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int typeC,double tankCapacity, int typeG, double batteryDuration, int typeE){
		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,typeC);

		this.tankCapacity = tankCapacity;

		switch(typeG){
		case 1: 
			this.gType = GasType.NORMAL;
			break;
		case 2: 
			this.gType = GasType.EXTRA;
			break;

		case 3: 

			this.gType = GasType.DIESEL;
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

	@Override
	public String toString(){
		super.toString() + "\n" +
		"Capacidad del tanque: " + tankCapacity + "\n" +
		"Tipo de gasolina: " + type + "\n" +
		"Consumo de gasolina: " + gasConsumption + "\n" + 
		"Capacidad de la bateria: " + batteryDuration + "\n" +
		"Tipo de cargador: " + cType + "\n" +
		"Consumo de la bateria: " + batteryConsumption + "\n";
	}
}

