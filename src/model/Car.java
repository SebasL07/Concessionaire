package model;

public abstract class Car extends Vehicle{
	
	private int numDoors;
	private boolean tintedWindows;
	private CarType type;

	public Car(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type){

		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate);
		this.numDoors = numDoors;
		this.tintedWindows = tintedWindows;

		switch(type){
		case 1:
			this.type = CarType.SEDAN;
			break;
		case 2: 
			this.type = CarType.PICKUP;
			break;
		}

		
	}

	@Override
	public String toString(){
		return super.toString() + "\n" + 
		"Numero de puertas: " + numDoors + "\n" + 
		"Ventanas polarizadas: " + tintedWindows + "\n" +
		"Tipo de carro: " + type;
	}
	
}