package model;

public class MotorCycle extends Vehicle{
	private MotoType mType;
	private double tankCapacity;
	private double gasConsumption;

	public MotorCycle(double basePrice, String brand, int model, double cylinderCapacity,double mileage, boolean wasUsed, String licensePlate,int mType, double tankCapacity){
		super(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate);
		this.tankCapacity = tankCapacity;
		calculateSalePrice();
		calculateConsumption();

		switch(mType){
		case 1: 
			this.mType = MotoType.STANDARD;
			break;

		case 2: 
			this.mType = MotoType.SPORT;
			break;

		case 3: 

			this.mType = MotoType.SCOOTER;
			break;

		case 4: 

			this.mType = MotoType.CROSS;
		}
		
	}

	@Override
	public String toString(){
		return super.toString() + "\n" + 
		"Tipo de moto: " + mType + "\n" + 
		"capacidad del tanque: " + tankCapacity + "\n" +
		"Consumo de gasolina: " + gasConsumption;		
	}

	@Override
	public void calculateSalePrice(){
		double salePrice = 0;
		if(super.getWasUsed()){
			salePrice = super.getBasePrice() + (super.getBasePrice()*0.02);
		} else{
			salePrice = super.getBasePrice() + (super.getBasePrice()*0.04);
		}

		super.setSellPrice(salePrice);
	}

	@Override
	public void calculateConsumption(){

		gasConsumption = tankCapacity * (super.getCylinderCapacity()/180);
	}

	
}