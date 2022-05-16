package model;

public class MotorCycle extends Vehicle{
	private MotoType mType;
	private double tankCapacity;
	private double gasConsumption;

	public MotorCycle(double basePrice, String brand, String model, double cylinderCapacity,double mileage, boolean wasUsed, String licensePlate){
		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate);	
	}

	@Override
	public String toString(){
		return super.toString() + "\n" + 
		"Tipo de moto: " + mType + "\n" + 
		"capacidad del tanque: " + tankCapacity + "\n" +
		"Consumo de gasolina: " + gasConsumption;		
	}

	@Override
	public double calculateSalePrice(){
		return 0.0;
	}

	@Override
	public void calculateConsumption(){

		gasConsumption = tankCapacity * (super.getCylinderCapacity()/180);
	}

	
}