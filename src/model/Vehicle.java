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
	protected Document[] documents;

	public Vehicle(double basePrice, String brand, int model, double cylinderCapacity, double mileage, boolean wasUsed, String licensePlate){

		this.basePrice = basePrice;
		this.sellPrice = 0;
		this.brand = brand;
		this.model = model;
		this.cylinderCapacity = cylinderCapacity;
		this.mileage = mileage;
		this.wasUsed = wasUsed;
		this.licensePlate = licensePlate;
		for(int i = 0; i<5; i++){
			id += (int)(Math.random()*10);
		}
		documents = new Document[MAX_DOCUMENT];
	}
	public String toString(){
		String msg = "";
		if(wasUsed){
			msg = "Si";
		}
		return "\n****Datos del Vehiculo****\n"+
		"ID del vehiculo: " + id + "\n" +
		"Precio base: " + basePrice + "\n"+
		"Precio de venta: " + sellPrice + "\n"+ 
		"Marca: " + brand + "\n" + 
		"Modelo: " + model + "\n"+
		"Cilindraje: " + cylinderCapacity + "\n"+ 
		"Kilometraje: " + mileage + "\n"+ 
		"Usado: " + msg + "\n"+ 
		"Placa: " + licensePlate;
	}

	public void addDocument(double priceSoat,double priceMT,double price, int yearSoat, int yearMT,int year, double insurance, double gasLevel){
		
		if(yearSoat != -1 && yearSoat == 2022){
			documents[0] = new SOAT(price,year,insurance);
		} else {
			documents[0] = null;
		} 

		
		documents[1] = new MTReview(price,year,gasLevel);
		
		
		if(year != -1){
			documents[2] = new PropertyCard(price,year);
		}else{
			documents[2] = null;
		}	
	}

	public  String showDocument(){
		String msg = "";

		for(int i = 0;i<MAX_DOCUMENT;i++){
			if(documents[i] != null){
				msg += documents[i].toString();
			}
		}

		return msg;
	}

	public abstract void calculateSalePrice();

	public int getModel(){
		return model;
	}

	public double getCylinderCapacity(){
		return cylinderCapacity;
	}

	public double getBasePrice(){
		return basePrice;
	}

	public void setSellPrice(double sP){
		sellPrice = sP;
	}

	public boolean getWasUsed(){
		return wasUsed;
	}
	public String getID(){
		return id;
	}

	

}