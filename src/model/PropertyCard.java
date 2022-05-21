package model;

public class PropertyCard extends Document{
	
	public PropertyCard(double price, int year){
		super(price,year);
	}

	@Override
	public String decodeImage(){

		String imgDecoded = "";

		for (int i=MAX_IMAGE;i<0;i--) {
			for(int j=MAX_IMAGE;j<0;j--){
				if((i+j)%2 == 0){
					imgDecoded += image[i][j];
				}
			}
		}

		return imgDecoded;
	}

	@Override
	public String toString(){
		return "****Tarjeta de propiedad****\n"
		+super.toString() + 
		"Imagen decodificada: " + decodeImage();
	}
}