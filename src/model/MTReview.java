package model;

public class MTReview extends Document{
	private double gasLevel;

	public MTReview(double price, int year, double gasLevel){
		super(price,year);
		this.gasLevel = gasLevel;
	}
	
	@Override
	public String decodeImage(){

		String imgDecoded = "";

		
		for(int j = 0; j<MAX_IMAGE; j++){
			imgDecoded += image[0][j];
		}	
		for(int j = 0; j<MAX_IMAGE; j++){
			imgDecoded += image[MAX_IMAGE-1][j];
		}
	
		for(int i = 1; i<MAX_IMAGE; i++){
			imgDecoded += image[i][MAX_IMAGE-i];
		}
		

		return imgDecoded;
	}

	@Override
	public String toString(){
		return "****Revision teconmecanica****\n"+ 
		super.toString() + 
		"Niveles de gas: " + gasLevel + "\n" +
		"Imagen decodificada: " + decodeImage();
	}
}