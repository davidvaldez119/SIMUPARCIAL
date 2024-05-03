package Vehiculos;

public class Car extends Vehicle
{
	private Integer numAirbacks;

	public Car(String modelo, Double precio, Integer numAirbacks) 
	{
		super(modelo, precio);
		this.numAirbacks = numAirbacks;
	}

	public Integer getNumAirbacks() {
		return numAirbacks;
	}

	public void setNumAirbacks(Integer numAirbacks) {
		this.numAirbacks = numAirbacks;
	}
	

}
