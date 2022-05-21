package model;
import java.util.ArrayList;

public class Concessionaire{
	
	protected ArrayList<Vehicle> vehicles;


	public Concessionaire(){
		vehicles = new ArrayList<Vehicle>();
	}

	public void addGasCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate,int numDoors, int tintedWindows, int type, double tankCapacity, int typeG,double priceSoat,double priceMT,double price, int yearSoat, int yearMT,int year, double insurance, double gasLevel){

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
		vehicles.get(vehicles.size()-1).addDocument(priceSoat,priceMT,price,yearSoat,yearMT,year,insurance,gasLevel);
	}

	public void addElectricCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate,int numDoors, int tintedWindows, int type, double batteryDuration, int typeE,double priceSoat,double priceMT,double price, int yearSoat, int yearMT,int year, double insurance, double gasLevel){
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
		vehicles.get(vehicles.size()-1).addDocument(priceSoat,priceMT,price,yearSoat,yearMT,year,insurance,gasLevel);
	}


	public void addHybridCar(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate,int numDoors, int tintedWindows, int type, double tankCapacity, int typeG,double batteryDuration, int typeE,double priceSoat,double priceMT,double price, int yearSoat, int yearMT,int year, double insurance, double gasLevel){

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
		

		vehicles.add(new HybridCar(basePrice,brand,model,cylinderCapacity,mileage,used,licensePlate,numDoors,tWindows,type,tankCapacity,typeG,batteryDuration,typeE));
		vehicles.get(vehicles.size()-1).addDocument(priceSoat,priceMT,price,yearSoat,yearMT,year,insurance,gasLevel);
	}

	public String showInfoCar(){

		String msg = "";

		for(int i = 0; i<vehicles.size();i++){
			if(vehicles.get(i) instanceof GasCar || vehicles.get(i) instanceof ElectricCar || vehicles.get(i) instanceof HybridCar){
				vehicles.get(i).toString();
			}	
		}

		return msg;
	}
}