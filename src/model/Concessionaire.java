package model;
import java.util.ArrayList;

public class Concessionaire{
	
	protected static final int SIZE_I = 10;
	protected static final int SIZE_J = 5;

	protected ArrayList<Vehicle> vehicles;
	protected Vehicle[][] parking;


	public Concessionaire(){
		vehicles = new ArrayList<Vehicle>();
		parking = new Vehicle[SIZE_I][SIZE_J];
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