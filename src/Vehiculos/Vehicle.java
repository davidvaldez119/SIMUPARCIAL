package Vehiculos;

public class Vehicle 
{
	
   private String modelo;

   private Double precio;

public Vehicle(String modelo, Double precio) 
  {
	
	this.modelo = modelo;
	this.precio = precio;
  }

public String getModelo() 
  {
	return modelo;
  }

public void setModelo(String modelo) 
  {
	this.modelo = modelo;
  }

public Double getPrecio() 
  {
	return precio;
  }

public void setPrecio(Double precio) 
  {
	this.precio = precio;
  }

@Override
public String toString() 
   {
	return "Vehicle [modelo=" + modelo + ", precio=" + precio + "]";
   }

}
