package Vehiculos;

import java.util.ArrayList;

public class RoadCar extends Car implements Sports
{
	
	private Integer numberOfOcupants;
	

	

	public RoadCar(String modelo, Double precio, Integer numAirbacks, Integer numberOfOcupants) 
	{
		super(modelo, precio, numAirbacks);
		this.numberOfOcupants = numberOfOcupants;
	}

	public Integer getNumberOfOcupants() 
	{
		return numberOfOcupants;
	}

	public void setNumberOfOcupants(Integer numberOfOcupants) 
	{
		this.numberOfOcupants = numberOfOcupants;
	}
	@Override
	public String toString() 
	{
		return "RoadCar [numberOfOcupants=" + numberOfOcupants + "]";
	}

	@Override
	public void runRoad() {
		// TODO Auto-generated method stub
		
	}
	public void tourAndShowRoadCar() 
	  {
		ArrayList<RoadCar>ArrayListRc=new ArrayList<>();
		for(int i=0;i<ArrayListRc.size();i++) 
		{
			ArrayListRc.get(i).toString();
			
		}
		
	  }
	public Double UpdatePriceRcar() {
		
		return super.getPrecio()*0.1;
		
	}
}
