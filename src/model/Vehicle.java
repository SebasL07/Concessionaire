package model;

public abstract class Vehicle implements Consumption{
	private static final int MAX_DOCUMENT = 3;
	private double basePrice;
	private double sellPrice;
	private String brand;
	private int model;
	private double cylinderCapacity;
	private double mileage;
	private boolean wasUsed;
	private String licensePlate;
	private Document[] documents;

	public Vehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate){

		this.basePrice = basePrice;
		this.sellPrice = 0;
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
			msg = "Si";
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

	public void addDocument(double price, int year, double insurance, double gasLevel){
		
		documents[0] = new SOAT(price,year,insurance);
		documents[1] = new MTReview(price,year,gasLevel);
		documents[2] = new PropertyCard(price,year);
		
	}

	public abstract double calculateSalePrice();

	public int getModel(){
		return model;
	}

	

}