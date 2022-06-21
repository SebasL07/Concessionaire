package model;
import java.util.ArrayList;

public class Concessionaire{
	/**
	 * SIZE_I is te constant size of the parking representing the rows
	 * */
	protected static final int SIZE_I = 10;
	/**
	 * SIZE_J is te constant size of the parking representing the columns
	 * */
	protected static final int SIZE_J = 5;

	/**
	 * vehicles is an arraylist of objects type vehicles 
	 * */
	protected ArrayList<Vehicle> vehicles;
	/**
	 * parking is a matrix of objects vehicle that represents a parking in real life
	 * */
	protected Vehicle[][] parking;

	/**
	 * Constructor of the class Concessionaire
	 * pos: initializes vehicles and parking
	 * */
	public Concessionaire(){
		vehicles = new ArrayList<Vehicle>();
		parking = new Vehicle[SIZE_I][SIZE_J];
	}

	/**
	 * This method is for creating a new object of the class GasCar
	 * @param basePrice double,  is the base price of the vehicle
	 * @param brand String, is the brand of the vehicle
	 * @param model int, is the year of the vehicle(model)
	 * @param cylinderCapacity double, is the cylinder capacity of the vehicle
	 * @param mileage double, is  the mileage of the vehicle
	 * @param wasUsed int, is a number to do another process and stablish the state of the vehicle
	 * @param licensePlate String, is the licensePlate of the vehicle
	 * @param numDoors int, is the number of doors that have the car
	 * @param tintedWindows int, is a number to do another process and stablish if the car has tinted windows
	 * @param type int, is a number to start another process to stablish the type of car it is 
	 * @param tankCapacity double, is the capacity of the gas tank of the car
	 * @param typeG int, is a number to start another process to stablish the type of gas that the car uses
	 * @param priceSoat double, is the price of the soat if the vehicle has it
	 * @param priceMT double, is the price of the technical-mechanical review
	 * @param price double, is the price of the property card if the vehicle has it  
	 * @param yearSoat int, is the year of the soat if the vehicle has it
	 * @param yearMT int, is the year of the technical-mechanical review
	 * @param year int, is the year of the property card
	 * @param insurance double, is the insurance that the 
	 */ 
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
		addVehicle2Parking();
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
		addVehicle2Parking();
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
		addVehicle2Parking();
	}

	public void addMotorCycle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, int wasUsed, String licensePlate, int mType, double tankCapacity,double priceSoat,double priceMT,double price, int yearSoat, int yearMT,int year, double insurance, double gasLevel){

		boolean used = false;
		if(wasUsed == 1){
			used = true;	
		} else {
			licensePlate = "";
			mileage = 0;
		}
		

		vehicles.add(new MotorCycle(basePrice,brand,model,cylinderCapacity,mileage,used,licensePlate,mType,tankCapacity));
		vehicles.get(vehicles.size()-1).addDocument(priceSoat,priceMT,price,yearSoat,yearMT,year,insurance,gasLevel);
		addVehicle2Parking();
	}

	public String showInfoCar(){

		String msg = "";

		for(int i = 0; i<vehicles.size();i++){
			if(vehicles.get(i) instanceof GasCar || vehicles.get(i) instanceof ElectricCar || vehicles.get(i) instanceof HybridCar){
				msg += vehicles.get(i).toString();
			}	
		}

		return msg;
	}

	public String showInfoMoto(){

		String msg = "";

		for(int i = 0; i<vehicles.size();i++){
			if(vehicles.get(i) instanceof MotorCycle){
				msg += vehicles.get(i).toString();
			}	
		}

		return msg;
	}

	public String showInfoUsed(){

		String msg = "";

		for(int i = 0; i<vehicles.size();i++){
			if (vehicles.get(i).getWasUsed()) {
				msg += vehicles.get(i).toString();
			}
		}

		return msg;
	}


	public String showInfoNew(){

		String msg = "";

		for(int i = 0; i<vehicles.size();i++){
			if (!(vehicles.get(i).getWasUsed())) {
				msg += vehicles.get(i).toString();
			}
		}

		return msg;
	}

	public String showInfoFuel(int option){

		String msg = "";
		/*
		switch(option){
		
		case 1: 
			for(int i = 0; i<vehicles.size();i++){
				if (vehicles.get(i) instanceof GasCar || vehicles.get(i) instanceof HybridCar) {
					if(vehicles.get(i).getGasType() == GasType.NORMAL || vehicles.get(i).getGasType() == GasType.NORMAL){
						msg += vehicles.get(i).toString();
					}
				}
			}
			break;

		case 2: 

			for(int i = 0; i<vehicles.size();i++){
				if (vehicles.get(i) instanceof GasCar || vehicles.get(i) instanceof HybridCar) {
					if(vehicles.get(i).getGasType() == GasType.EXTRA || vehicles.get(i).getGasType() == GasType.EXTRA){
						msg += vehicles.get(i).toString();
					}
				}
			}
			break;

		case 3: 

			for(int i = 0; i<vehicles.size();i++){
				if (vehicles.get(i) instanceof GasCar || vehicles.get(i) instanceof HybridCar) {
					if(vehicles.get(i).getGasType() == GasType.DIESEL || vehicles.get(i).getGasType() == GasType.DIESEL){
						msg += vehicles.get(i).toString();
					}
				}
			}
			break;
		}
		*/
		return msg;
	}

	public String showDocumentByID(String id){
		
		String msg = "";
		int pos = findVehicle(id);

		if(pos != -1){
			msg += vehicles.get(pos).showDocument();
		}else{
			msg = "Lo sentimos es vehiculo no existe";
		}

		return msg;
		
	}

	public int findVehicle(String id){

		boolean sen = false;
		int idFound = -1; 

		for(int i = 0;i<vehicles.size() && !sen;i++){
			if(id.equals(vehicles.get(i).getID())){
				idFound = i;
				sen = true;
			}
		}

		return idFound;
	}

	public void addVehicle2Parking(){

		for(int i=0;i<SIZE_I;i++){
			if(vehicles.get(i).getModel() == 2014){
				parking[i][0] = vehicles.get(i);
			} else if(vehicles.get(i).getModel() == 2013){
				parking[i][1] = vehicles.get(i);
			}else if(vehicles.get(i).getModel() == 2012){
				parking[i][2] = vehicles.get(i);
			} else if(vehicles.get(i).getModel() == 2011){
				parking[i][3] = vehicles.get(i);
			} else if(vehicles.get(i).getModel() < 2011){
				parking[i][4] = vehicles.get(i);
			}
		}
	}

	public String printParking(){
		String map = "";

		for (int i=0; i< SIZE_I; i++){ 
			for (int j = 0; j < SIZE_J; j++){ 
				if(parking[i][j]!=null){
					map += "|1|"; 
				} else{
					map += "|0|";
				}

			}
			map += "\n";
		}
		return map;
	} 

	public double calculateOccupation(){
		
		int counter = 0;
		double ocuppation;
		for(int i = 0; i<SIZE_I;i++){
			for(int j = 0;j<SIZE_J;j++){
				if(parking[i][j]!=null){
					counter++;
				}
			}
		}

		ocuppation = (counter/(SIZE_I*SIZE_J))*100;
		return ocuppation;
	}

	public String findInRange(int year1,int year2){

		String msg = "";
		if(year1<year2){
			for(int i = 0; i<SIZE_I;i++){
				for(int j = 0;j<SIZE_J;j++){
					if(parking[i][j]!=null && parking[i][j].getModel() < year2 || parking[i][j].getModel() > year1){
						msg+=parking[i][j].toString();
					}
				}
			}
		} else if(year1>year2){
			for(int i = 0; i<SIZE_I;i++){
				for(int j = 0;j<SIZE_J;j++){
					if(parking[i][j]!=null && parking[i][j].getModel() > year2 || parking[i][j].getModel() < year1){
						msg+=parking[i][j].toString();
					}
				}
			}
		}

		return msg;
	}

	public String findNewestAndOldest(){

		String msg = "";
		int iNew = 0;
		int jNew = 0;
		int iOld = 0;
		int jOld = 0;
		for(int i = SIZE_I; i<0;i--){
			for(int j = SIZE_J; j<0;j--){
				if(parking[i][j].getModel()<parking[iOld][jOld].getModel()){
					iOld = i;
					jOld = j;
				}
			}
		}
		msg += "Mas viejo:\n"+ parking[iOld][jOld];

		for(int i = SIZE_I; i<0;i--){
			for(int j = SIZE_J; j<0;j--){
				if(parking[i][j].getModel()>parking[iOld][jOld].getModel()){
					iNew = i;
					jNew = j;
				}
			}
		}

		msg += "Mas viejo:\n"+ parking[iNew][jNew];

		return msg;
	}




}