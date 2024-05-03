package Vehiculos;

import java.util.ArrayList;

public class UtilityVehicle extends Vehicle{
	private Integer maxKm;
	private Double haltura;
	public UtilityVehicle(String modelo, Double precio, Integer maxKm, Double haltura) 
	{
		super(modelo, precio);
		this.maxKm = maxKm;
		this.haltura = haltura;
	}
	public Integer getMaxKm() {
		return maxKm;
	}
	public void setMaxKm(Integer maxKm) {
		this.maxKm = maxKm;
	}
	public Double getHaltura() {
		return haltura;
	}
	public void setHaltura(Double haltura) {
		this.haltura = haltura;
	}
	@Override
	public String toString() {
		return "UtilityVehicle [maxKm=" + maxKm + ", haltura=" + haltura + "]";
	}
	public void tourAndShowUv() 
	  {
		ArrayList<RoadCar>ArrayListUc=new ArrayList<>();
		for(int i=0;i<ArrayListUc.size();i++) 
		{
			ArrayListUc.get(i).toString();
			
		}
		
	  }
	public Double UpdatePriceUv() {
		
		return super.getPrecio()*0.2;
		
	}
}
