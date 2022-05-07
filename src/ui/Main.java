package ui;
import java.util.Scanner;
import model.Concessionaire;

public class Main{
	
	private Scanner reader;
	private Concessionaire objContr;
	
	public Main() {
		objContr= new Concessionaire();
		sc= new Scanner(System.in);
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
		option= sc.nextInt();
		sc.nextLine();
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
		System.out.println("Which kind of car do you want to register?\n"+ 
			"1) Gas car\n"+
			"2) Electric car\n"+
			"3) Hybrid car");
		int option = reader.nextInt();
		reader.nextLine();

		switch(option){
		case 1: 
			registerGasCar();
			break;
		case 2:
			break;
		case 3: 
			break;
		}	
	}

	public void registerGasCar(){

		System.out.println("Insert the brand of the car");
		String brand = reader.nextLine();

		System.out.println("Insert the model of the car");
		String model = reader.nextLine();

		System.out.println("Please insert the basic price of the car");
		double basePrice = reader.nextDouble();
		reader.nextLine();

		System.out.println("Insert the cylinder capacity of the car");
		double cylinderCapacity = reader.nextDouble();
		reader.nextLine();

		System.out.println("El carro fue usado?\n"+
			"1) Yes\n"
			"2) No");
		int wasUsed = reader.nextInt();
		reader.nextLine();

		double priceSoat = -1;
		int year = -1;
		double insurance = -1;

		if(wasUsed == 1){

			System.out.println("Cuanto es el kilometraje del carro?");
			double mileage = reader.nextDouble();
			reader.nextLine();

			System.out.println("Cual es la placa del carro?");
			String licensePlate = reader.nextLine();

			System.out.println("Tiene Soat?\n" +
				"1) Si\n" + 
				"2) No");
			int soat = reader.nextInt();
			reader.nextLine();

			if(soat = 1){
				System.out.println("Que precio tiene el soat?");
				priceSoat = reader.nextDouble();
				reader.nextLine();

				System.out.println("Que año tiene el SOAT?");
				year = reader.nextInt();
				reader.nextLine();

				System.out.println("Cuanto cubre el seguro del SOAT?");
				insurance = reader.nextDouble();
				reader.nextLine();
			} 

			System.out.println("");

		}
	}
}