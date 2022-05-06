package model;

public abstract class Document{
	
	protected static final int MAX_IMAGE = 5;
	private double price;
	private int year;
	protected int [][] image;

	public Document(double price, int year){
		this.price = price;
		this.year = year;
		image = new int[MAX_IMAGE][MAX_IMAGE];
		
	}
}