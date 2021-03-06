package model;

public class SOAT extends Document{
	private double insurance;

	public SOAT(double price, int year, double insurance){

		super(price, year);
		this.insurance = insurance;
	}
	@Override
	public String decodeImage(){

		String imgDecoded = "";

		for(int i = 0;i<MAX_IMAGE;i++){
			if(i == MAX_IMAGE-1){
				for(int j = 0;j<MAX_IMAGE;j++){
					imgDecoded += image[MAX_IMAGE-1][j];
				}
			} else{
				imgDecoded += image[i][0];
			}
		}

		return imgDecoded;

	}

	@Override
	public String toString(){
		return "****SOAT****\n"+
		super.toString() + 
		"Seguro: " + insurance + "\n" +
		"Imagen decodificada: " + decodeImage();
	}
}