package model;
import java.util.ArrayList;

public class Concessionaire{
	
	private ArrayList<Vehicle> vehicles;


	public Concessionaire(){
		vehicles = new ArrayList<Vehicle>();
	}

	public void addGasCar(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate,int numDoors, int tintedWindows, int type, double tankCapacity, int typeG){

		boolean used = false;
		boolean tWindows = false;
		if(wasUsed == 1){
			used = true;	
		} else {
			licensePlate = "";
			mileage = 0;
		}

		if(tintedWindows == 1){
			tWindows = true;
		}
		

		vehicles.add(new GasCar(basePrice,brand,model,cylinderCapacity,mileage,used,licensePlate,numDoors,tWindows,type,tankCapacity,typeG));
	}

	public void addElectricCar(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate,int numDoors, int tintedWindows, int type, double batteryDuration, int typeE){
		boolean used = false;
		boolean tWindows = false;
		if(wasUsed == 1){
			used = true;	
		} else {
			licensePlate = "";
			mileage = 0;
		}

		if(tintedWindows == 1){
			tWindows = true;
		}
		

		vehicles.add(new ElectricCar(basePrice,brand,model,cylinderCapacity,mileage,used,licensePlate,numDoors,tWindows,type,batteryDuration,typeE));
	}

	public void addDocument2Vehicle(int option, double price, int year, double insurance, double gasLevel){

		

	}



	public void addHybridCar(double basePrice, String brand, String model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate,int numDoors, int tintedWindows, int type, double tankCapacity, int typeG,double batteryDuration, int typeE){

		boolean used = false;
		boolean tWindows = false;
		if(wasUsed == 1){
			used = true;	
		} else {
			licensePlate = "";
			mileage = 0;
		}

		if(tintedWindows == 1){
			tWindows = true;
		}
		

		vehicles.add(new GasCar(basePrice,brand,model,cylinderCapacity,mileage,used,licensePlate,numDoors,tWindows,type,tankCapacity,typeG));





}