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
		for(int i = 0;i<MAX_IMAGE;i++){
			for(int j = 0; j<MAX_IMAGE;j++){
				image[i][j] = (int)(Math.random()*10);
			}
		}
	}

	public abstract String decodeImage();

	public String toString(){
		return "\n****Datos****\n"+
		"Año: " + year + "\n" +
		"Precio: "+ price + "\n";
	}

	public int getYear(){
		return year;
	}


}