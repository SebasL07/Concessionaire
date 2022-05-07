package model;

public class SOAT extends Document{
	private double insurance;

	public SOAT(double price, int year, double insurance){

		super(price, year);
		this.insurance = insurance;
	}
	
}