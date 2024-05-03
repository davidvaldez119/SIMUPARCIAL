package Vehiculos;

import java.util.ArrayList;

public class UrbanCar extends Car {
	
	private Double maxVelocity;

	public UrbanCar(String modelo, Double precio, Integer numAirbacks, Double maxVelocity) {
		super(modelo, precio, numAirbacks);
		this.maxVelocity = maxVelocity;
	}

	public Double getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(Double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}

	@Override
	public String toString() {
		return "UrbanCar [maxVelocity=" + maxVelocity + "]";
	}
	public void tourAndShowUrbanCar() 
	  {
		ArrayList<UrbanCar>ArrayListUc=new ArrayList<>();
		for(int i=0;i<ArrayListUc.size();i++) 
		{
			ArrayListUc.get(i).toString();
			
		}
		
	  }
	public Double UpdatePriceUc() {
		
		return super.getPrecio()*0.15;
		
	}
}
