package ui;
import java.util.Scanner;
import model.Concessionaire;

public class Main{
	
	private Scanner reader;
	private Concessionaire objContr;
	
	public Main() {
		objContr= new Concessionaire();
		reader = new Scanner(System.in);
	}
	public static void main(String [] args) {
		
		System.out.println("Initializing...");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Hola, bienvenido al concesionario y parqueadero. Que desea hacer?\n" +
				"(1) Register a vehicle\n" +
				"(2) Para crear el rectángulo\n"+
				"(3) Para crear el círculo  \n"+
				"(4) Para mostrar las figuras\n" +  
				"(0) Para salir"
				);
		option= reader.nextInt();
		reader.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerVehicle();
			break;
		case 2:
			
			break;
	
		case 3:
			
			break;

		case 4:
			
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

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
		double yearMT = reader.nextInt();
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

		objContr.addGasCar(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type,tankCapacity,typeG);

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
		double yearMT = reader.nextInt();
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

		objContr.addElectricCar(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type,batteryDuration,typeE);

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
		double yearMT = reader.nextInt();
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

		objContr.addHybridCar(basePrice,brand,model,cylinderCapacity,mileage,wasUsed,licensePlate,numDoors,tintedWindows,type,tankCapacity,typeG,batteryDuration,typeE);

	}
}
	