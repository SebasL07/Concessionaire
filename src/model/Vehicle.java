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
}