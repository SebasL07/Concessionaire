package model;

public class MTReview extends Document{
	private double gasLevel;

	public MTReview(double price, int year, double gasLevel){
		super(price,year);
		this.gasLevel = gasLevel;
	}
	
}