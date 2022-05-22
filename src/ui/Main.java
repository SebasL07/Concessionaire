package ui;
import java.util.Scanner;
import model.Concessionaire;

/**
 * Tarea integradora
 * @author SebasL07
 * @since May 2022
 * @version 1.0
 */

public class Main{
	
	/**
	 * reader is an object from the class Scanner from library of Java
	 * */
	private Scanner reader;
	/**
	 * objContr is an object from the class Concessionaire to connect model with ui
	 * */
	private Concessionaire objContr;
	/** Constructor method for the class Main
	*initialize the objContr and the Scanner reader
	*/
	public Main() {
		objContr= new Concessionaire();
		reader = new Scanner(System.in);
	}
	/**
	 * method main 
	 * @param args String[]
	 * */
	public static void main(String [] args) {
		
		System.out.println("Iniciando la aplicacion...\n" +
			"Hola, bienvenido al concesionario y parqueadero");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	/**
	 * show menu of option to do in the app
	 * @return option that chose the user
	 * */
	public int showMenu() {
		int option=0;

		System.out.println(
				"\nQue desea hacer?\n" +
				"(1) Registrar vehiculo\n" +
				"(2) Mostrar informacion\n"+
				"(3) Buscar documentacion de un vehiculo\n"+
				"(4) Imprimir mapa del parqueadero\n" + 
				"(5) Informacion del parqueadero\n" + 
				"(0) Para salir"
				);
		option= reader.nextInt();
		reader.nextLine();
		return option;
	}
	/**
	 * show menu of option to do in the app
	 * @param operation int that represents the option the option that chose the user
	 * */
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerVehicle();
			break;
		case 2:
			showInformation();
			break;
	
		case 3:
			showDocumentByID();
			break;

		case 4:
			System.out.println("1ra columna: 2014\n"+"\n2da columna: 2013\n"+"\n3ra columna: 2012\n"+"\n4ta columna: 2011\n"+"\n5ta columna: <2011\n"+
				objContr.printParking());
			break;

		case 5:
			informationParking();
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	/**
	 * register vehicle is used for choose which vehicle to register
	 * */

	public void registerVehicle(){
		System.out.println("Which kind of vehicle do you want to register?\n"+ 
			"1) Car\n"+
			"2) MotorCycle");
		int option = reader.nextInt();
		reader.nextLine();

		switch(option){
		case 1: 
			registerCar();
			break;
		case 2:
			registerMotorcycle();
			break;
		}
	}

	public void registerCar(){
		System.out.println("Que tipo de carro quiere registrar?\n"+ 
			"1) Carro de gasolina\n"+
			"2) Carro electrico\n"+
			"3) Carro hibrido");
		int option = reader.nextInt();
		reader.nextLine();

		switch(option){
		case 1: 
			registerGasCar();
			break;
		case 2:
			registerElectricCar();
			break;
		case 3: 
			registerHybridCar();
			break;
		}	
	}

	public void registerGasCar(){

		System.out.println("Insert the brand of the car");
		String brand = reader.nextLine();

		System.out.println("Insert the model of the car");
		int model = reader.nextInt();
		reader.nextLine();

		System.out.println("Please insert the basic price of the car");
		double basePrice = reader.nextDouble();
		reader.nextLine();

		System.out.println("Insert the cylinder capacity of the car");
		double cylinderCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("El carro fue usado?\n"+
			"1) Yes\n"+
			"2) No");
		int wasUsed = reader.nextInt();
		reader.nextLine();

		double priceSoat = -1;
		int yearSoat = -1;
		double insurance = -1;
		double mileage = 0;
		String licensePlate = "";
		double priceProperty = -1;
		int yearProperty = -1;

		if(wasUsed == 1){

			System.out.println("Cuanto es el kilometraje del carro?");
			mileage = reader.nextDouble();
			reader.nextLine();

			System.out.println("Cual es la placa del carro?");
			licensePlate = reader.nextLine();

			System.out.println("Tiene Soat?\n" +
				"1) Si\n" + 
				"2) No");
			int soat = reader.nextInt();
			reader.nextLine();

			if(soat == 1){
				System.out.println("Que precio tiene el soat?");
				priceSoat = reader.nextDouble();
				reader.nextLine();

				System.out.println("Que año tiene el SOAT?");
				yearSoat = reader.nextInt();
				reader.nextLine();

				System.out.println("Cuanto cubre el seguro del SOAT?");
				insurance = reader.nextDouble();
				reader.nextLine();
			} 

			System.out.println("Escriba los datos de la tarjeta de propiedad\n"+
				"Precio de la tarjeta de propiedad");
			priceProperty = reader.nextDouble();

			System.out.println("Que año tiene la tarjeta de propiedad?");
			yearProperty = reader.nextInt();
			reader.nextLine();
		}

		System.out.println("Ahora los datos de la revision tecnomecanica\n" + "Ingrese el precio de la revisión");
		double priceMT=reader.nextDouble();
		reader.nextLine();
		System.out.println("Que año tiene la revision?");
		int yearMT = reader.nextInt();
		reader.nextLine();
		System.out.println("Que niveles de gas indicaron la revision?");
		double gasLevel = reader.nextDouble();
		reader.nextLine();

		System.out.println("Cuantas puertas tiene el carro?");
		int numDoors = reader.nextInt();
		reader.nextLine();

		System.out.println("Tiene las ventanas polarizadas?\n"+
			"1) Si\n"+ 
			"2) No");
		int tintedWindows = reader.nextInt();
		reader.nextLine();

		System.out.println("Que tipo de carro es?\n"+
			"1) Sedan\n"+
			"2) Camioneta");

		int type = reader.nextInt();
		reader.nextLine();

		System.out.println("Cual es al capacidad del tanque?");
		double tankCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("Que tipo de gasolina utiliza?\n"+
			"1) Normal\n"+
			"2) Extra\n"+
			"3) Diesel");
		int typeG = reader.nextInt();
		reader.nextLine();

		objContr.addGasCar(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type,tankCapacity,typeG,priceSoat,priceMT,priceProperty,yearSoat,yearMT,yearProperty,insurance,gasLevel);
	}

	public void registerElectricCar(){

		System.out.println("Insert the brand of the car");
		String brand = reader.nextLine();

		System.out.println("Insert the model of the car");
		int model = reader.nextInt();
		reader.nextLine();

		System.out.println("Please insert the basic price of the car");
		double basePrice = reader.nextDouble();
		reader.nextLine();

		System.out.println("Insert the cylinder capacity of the car");
		double cylinderCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("El carro fue usado?\n"+
			"1) Yes\n"+
			"2) No");
		int wasUsed = reader.nextInt();
		reader.nextLine();

		double priceSoat = -1;
		int yearSoat = -1;
		double insurance = -1;
		double mileage = 0;
		String licensePlate = "";
		double priceProperty = -1;
		int yearProperty = -1;

		if(wasUsed == 1){

			System.out.println("Cuanto es el kilometraje del carro?");
			mileage = reader.nextDouble();
			reader.nextLine();

			System.out.println("Cual es la placa del carro?");
			licensePlate = reader.nextLine();

			System.out.println("Tiene Soat?\n" +
				"1) Si\n" + 
				"2) No");
			int soat = reader.nextInt();
			reader.nextLine();

			if(soat == 1){
				System.out.println("Que precio tiene el soat?");
				priceSoat = reader.nextDouble();
				reader.nextLine();

				System.out.println("Que año tiene el SOAT?");
				yearSoat = reader.nextInt();
				reader.nextLine();

				System.out.println("Cuanto cubre el seguro del SOAT?");
				insurance = reader.nextDouble();
				reader.nextLine();
			} 

			System.out.println("Escriba los datos de la tarjeta de propiedad\n"+
				"Precio de la tarjeta de propiedad");
			priceProperty = reader.nextDouble();

			System.out.println("Que año tiene la tarjeta de propiedad?");
			yearProperty = reader.nextInt();
			reader.nextLine();
		}

		System.out.println("Ahora los datos de la revision tecnomecanica\n" + "Ingrese el precio de la revisión");
		double priceMT=reader.nextDouble();
		reader.nextLine();
		System.out.println("Que año tiene la revision?");
		int yearMT = reader.nextInt();
		reader.nextLine();
		System.out.println("Que niveles de gas indicaron la revision?");
		double gasLevel = reader.nextDouble();
		reader.nextLine();

		System.out.println("Cuantas puertas tiene el carro?");
		int numDoors = reader.nextInt();
		reader.nextLine();

		System.out.println("Tiene las ventanas polarizadas?\n"+
			"1) Si\n"+ 
			"2) No");
		int tintedWindows = reader.nextInt();
		reader.nextLine();

		System.out.println("Que tipo de carro es?\n"+
			"1) Sedan\n"+
			"2) Camioneta");

		int type = reader.nextInt();
		reader.nextLine();

		System.out.println("Cual es la duracion de la bateria?");
		double batteryDuration = reader.nextDouble();
		reader.nextLine();

		System.out.println("Que tipo de cargador utiliza?\n"+
			"1) Normal\n"+
			"2) Rapido");
		int typeE = reader.nextInt();
		reader.nextLine();

		objContr.addElectricCar(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type,batteryDuration,typeE,priceSoat,priceMT,priceProperty,yearSoat,yearMT,yearProperty,insurance,gasLevel);

	}

	public void registerHybridCar(){

		System.out.println("Insert the brand of the car");
		String brand = reader.nextLine();

		System.out.println("Insert the model of the car");
		int model = reader.nextInt();
		reader.nextLine();

		System.out.println("Please insert the basic price of the car");
		double basePrice = reader.nextDouble();
		reader.nextLine();

		System.out.println("Insert the cylinder capacity of the car");
		double cylinderCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("El carro fue usado?\n"+
			"1) Yes\n"+
			"2) No");
		int wasUsed = reader.nextInt();
		reader.nextLine();

		double priceSoat = -1;
		int yearSoat = -1;
		double insurance = -1;
		double mileage = 0;
		String licensePlate = "";
		double priceProperty = -1;
		int yearProperty = -1;

		if(wasUsed == 1){

			System.out.println("Cuanto es el kilometraje del carro?");
			mileage = reader.nextDouble();
			reader.nextLine();

			System.out.println("Cual es la placa del carro?");
			licensePlate = reader.nextLine();

			System.out.println("Tiene Soat?\n" +
				"1) Si\n" + 
				"2) No");
			int soat = reader.nextInt();
			reader.nextLine();

			if(soat == 1){
				System.out.println("Que precio tiene el soat?");
				priceSoat = reader.nextDouble();
				reader.nextLine();

				System.out.println("Que año tiene el SOAT?");
				yearSoat = reader.nextInt();
				reader.nextLine();

				System.out.println("Cuanto cubre el seguro del SOAT?");
				insurance = reader.nextDouble();
				reader.nextLine();
			} 

			System.out.println("Escriba los datos de la tarjeta de propiedad\n"+
				"Precio de la tarjeta de propiedad");
			priceProperty = reader.nextDouble();

			System.out.println("Que año tiene la tarjeta de propiedad?");
			yearProperty = reader.nextInt();
			reader.nextLine();
		}

		System.out.println("Ahora los datos de la revision tecnomecanica\n" + "Ingrese el precio de la revisión");
		double priceMT=reader.nextDouble();
		reader.nextLine();
		System.out.println("Que año tiene la revision?");
		int yearMT = reader.nextInt();
		reader.nextLine();
		System.out.println("Que niveles de gas indicaron la revision?");
		double gasLevel = reader.nextDouble();
		reader.nextLine();

		System.out.println("Cuantas puertas tiene el carro?");
		int numDoors = reader.nextInt();
		reader.nextLine();

		System.out.println("Tiene las ventanas polarizadas?\n"+
			"1) Si\n"+ 
			"2) No");
		int tintedWindows = reader.nextInt();
		reader.nextLine();

		System.out.println("Que tipo de carro es?\n"+
			"1) Sedan\n"+
			"2) Camioneta");

		int type = reader.nextInt();
		reader.nextLine();

		System.out.println("Cual es al capacidad del tanque?");
		double tankCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("Que tipo de gasolina utiliza?\n"+
			"1) Normal\n"+
			"2) Extra\n"+
			"3) Diesel");
		int typeG = reader.nextInt();
		reader.nextLine();

		System.out.println("Cual es la duracion de la bateria?");
		double batteryDuration = reader.nextDouble();
		reader.nextLine();

		System.out.println("Que tipo de cargador utiliza?\n"+
			"1) Normal\n"+
			"2) Rapido");
		int typeE = reader.nextInt();
		reader.nextLine();

		objContr.addHybridCar(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type,tankCapacity,typeG,batteryDuration,typeE,priceSoat,priceMT,priceProperty,yearSoat,yearMT,yearProperty,insurance,gasLevel);
	}

	public void registerMotorcycle(){

		System.out.println("Cual es la marca de la moto?");
		String brand = reader.nextLine();

		System.out.println("Ingrese el modelo de la moto");
		int model = reader.nextInt();
		reader.nextLine();

		System.out.println("Ingrese el precio base de la moto");
		double basePrice = reader.nextDouble();
		reader.nextLine();

		System.out.println("Inserte el cilindraje de la moto");
		double cylinderCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("La moto fue usada?\n"+
			"1) Si\n"+
			"2) No");
		int wasUsed = reader.nextInt();
		reader.nextLine();

		double priceSoat = -1;
		int yearSoat = -1;
		double insurance = -1;
		double mileage = 0;
		String licensePlate = "";
		double priceProperty = -1;
		int yearProperty = -1;

		if(wasUsed == 1){

			System.out.println("Cuanto es el kilometraje de la moto?");
			mileage = reader.nextDouble();
			reader.nextLine();

			System.out.println("Cual es la placa la moto?");
			licensePlate = reader.nextLine();

			System.out.println("Tiene Soat?\n" +
				"1) Si\n" + 
				"2) No");
			int soat = reader.nextInt();
			reader.nextLine();

			if(soat == 1){
				System.out.println("Que precio tiene el soat?");
				priceSoat = reader.nextDouble();
				reader.nextLine();

				System.out.println("Que año tiene el SOAT?");
				yearSoat = reader.nextInt();
				reader.nextLine();

				System.out.println("Cuanto cubre el seguro del SOAT?");
				insurance = reader.nextDouble();
				reader.nextLine();
			} 

			System.out.println("Escriba los datos de la tarjeta de propiedad\n"+
				"Precio de la tarjeta de propiedad");
			priceProperty = reader.nextDouble();

			System.out.println("Que año tiene la tarjeta de propiedad?");
			yearProperty = reader.nextInt();
			reader.nextLine();
		}

		System.out.println("Ahora los datos de la revision tecnomecanica\n" + "Ingrese el precio de la revisión");
		double priceMT=reader.nextDouble();
		reader.nextLine();
		System.out.println("Que año tiene la revision?");
		int yearMT = reader.nextInt();
		reader.nextLine();
		System.out.println("Que niveles de gas indicaron la revision?");
		double gasLevel = reader.nextDouble();
		reader.nextLine();

		System.out.println("Que tipo de moto es?\n"+
			"1) Estandar\n"+
			"2) Deportiva\n"+
			"3) Scooter\n"+
			"4) Cross");

		int type = reader.nextInt();
		reader.nextLine();

		System.out.println("Cual es al capacidad del tanque?");
		double tankCapacity = reader.nextDouble();
		reader.nextLine();

		objContr.addMotorCycle(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,type,tankCapacity,priceSoat,priceMT,priceProperty,yearSoat,yearMT,yearProperty,insurance,gasLevel);
	}

	public void showInformation(){

		System.out.println("Por que criterios quiere ver la informacion?\n"+
			"1) Tipo de vehiculo\n"+
			"2) Tipo de combustible\n"+ 
			"3) Autos nuevos/usados");
		int option = reader.nextInt();
		reader.nextLine();

		switch(option){

		case 1:
			
			System.out.println("Que tipo de vehiculo desea ver?\n"+
			"1) Carro\n"+
			"2) Motocicleta");
			int option2 = reader.nextInt();
			
			switch(option2){
			case 1:
				System.out.println(objContr.showInfoCar());
				break;
			case 2: 
				System.out.println(objContr.showInfoMoto());
				break;
			}



			break;
		case 2: 
			System.out.println("Desea ver los vehiculos con gasolina:\n"+
				"1) Normal\n"+
				"2) Extra\n"+
				"3) Diesel");

			int option3 = reader.nextInt();
			reader.nextLine();

			//System.out.println(objContr.showInfoFuel(option3));
			break;

		case 3:

			System.out.println("Desea ver los vehiculos:\n"+
				"1) Nuevos\n"+
				"2) Usados ");
			int option4 = reader.nextInt();
			reader.nextLine();

			switch(option4){
			case 1:
				System.out.println(objContr.showInfoNew());
				break;

			case 2: 
				System.out.println(objContr.showInfoUsed());
				break;
			}
			break;
		}
	}

	public void showDocumentByID(){
		System.out.println("Escriba el ID del vehiculo del cual desee ver la documentacion:");
		String id = reader.nextLine();

		System.out.println(objContr.showDocumentByID(id));
	}

	public void informationParking(){
		System.out.println("Que informacion desea ver del parqueadero?\n"+
			"1) Listado de vehiculos en un rango de años\n"+
			"2) Vehiculo mas viejo y mas nuevo\n"+
			"3) Porcentaje de ocupacion del parqueadero");
		int option = reader.nextInt();

		switch(option){
		case 1: 
			System.out.println("En que rango de años desea ver la informacion:\n"+
				"Año 1:\n"+
				"1) 2014\n"+
				"2) 2013\n"+
				"3) 2012\n"+
				"4) 2011\n"+
				"5) <2011\n\n"+
				"Año 2:\n"+
				"1) 2014\n"+
				"2) 2013\n"+
				"3) 2012\n"+
				"4) 2011\n"+
				"5) <2011\n");
			int year1 = reader.nextInt();
			int year2 = reader.nextInt();
			System.out.println("***Informacion de los carros***\n"+ objContr.findInRange(year1,year2));
			break;

		case 2: 
			System.out.println(objContr.findNewestAndOldest());
			break;

		case 3:
			System.out.println("El parqueadero se encuentra un " + objContr.calculateOccupation() + "% lleno");
			break;
		}
	}
}
	