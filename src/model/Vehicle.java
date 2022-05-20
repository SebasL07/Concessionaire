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
	private String id;
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

	public void addDocument(double priceSoat,double priceMT,double price, int yearSoat, int yearMT,int year, double insurance, double gasLevel){
		
		if(yearSoat != -1 && yearSoat == 2022){
			documents[0] = new SOAT(price,year,insurance);
		} else {
			documents[0] = null;
		} 

		if(yearMT == 2022){
			documents[1] = new MTReview(price,year,gasLevel);
		}else{
			documents[1] = null;
		}
		
		if(year != -1 && year == 2022){
			documents[2] = new PropertyCard(price,year);
		}else{
			documents[2] = null;
		}
		
		
		
	}

	public abstract double calculateSalePrice();

	public int getModel(){
		return model;
	}

	public double getCylinderCapacity(){
		return cylinderCapacity;
	}

	

}