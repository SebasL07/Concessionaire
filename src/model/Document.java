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

	public String decodeImage(){

		String imgDecoded = "";

		for(int i = 0;i<MAX_IMAGE;i++){
			if(i == MAX_IMAGE-1){
				for(int j = 0;j<MAX_IMAGE;j++){
					imgDecoded += image[i][j]
				}
			} else {
				imgDecoded += image[i][0];
			}

		}

	}


}