package model;

public abstract class Vehicle{
	private static final int MAX_DOCUMENT = 3;
	private double basePrice;
	private double sellPrice;
	private String brand;
	private String model;
	private double cylinderCapacity;
	private int mileage;
	private boolean wasUsed;
	private String licensePlate;
	private Document[] documents;

	public Vehicle(double basePrice, double sellPrice, String brand, String model, double cylinderCapacity, int mileage, boolean wasUsed, String licensePlate){

		this.basePrice = basePrice;
		this.sellPrice = sellPrice;
		this.brand = brand;
		this.model = model;
		this.cylinderCapacity = cylinderCapacity;
		this.mileage = mileage;
		this.wasUsed = wasUsed;
		this.licensePlate = licensePlate;
		documents = new Document[MAX_DOCUMENT];
	}
	public String toString(){
		String msg = "";
		if(wasUsed){
			msg = "Si"
		}
		return "****Datos del Vehiculo****\n"+
		"Precio base: " + basePrice + "\n"+
		"Precio de venta: " + sellPrice + "\n"+ 
		"Marca: " + brand + "\n" + 
		"Modelo: " + model + "\n"+
		"Cilindraje: " + cylinderCapacity + "\n"+ 
		"Kilometraje: " + mileage + "\n"+ 
		"Usado: " + msg+ "\n"+ 
		"Placa: " + licensePlate;
	}

	public void addDocument(){

		switch(option){
		case 1: 
			documents[0] = new SOAT(double price, int year, double insurance);
			break;

		case 2: 
			documents[1] = new MTReview(double price, int year, double gasLevel);
			break;

		case 3: 
			documents[2] = new PropertyCards(price,year);
			break;
		}
	
	}
}