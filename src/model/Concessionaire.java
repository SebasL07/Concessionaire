package model;
import java.util.ArrayList;

public class Concessionaire{
	
	private ArrayList<Vehicle> vehicles;


	public Concessionaire(){
		vehicles = new ArrayList<Vehicle>();
	}

	public void addGasCar(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, int wasUsed, String licensePlate,int numDoors, boolean tintedWindows, int type, double tankCapacity, int typeG){

		boolean used = false;
		switch(wasUsed){
		case 1: 
			used = true;
			break;
		}

		vehicles.add(new GasCar(basePrice,sellPrice,brand,model,cylinderCapacity,mileage,used,licensePlate,numDoors,tintedWindows,type,tankCapacity,typeG));
	}
}