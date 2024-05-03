package Vehiculos;

import java.util.ArrayList;

public class Motorcicle extends Vehicle implements Sports
{
private Double engCapacity;//cilindrada

public Motorcicle(String modelo, Double precio, Double engCapacity) {
	super(modelo, precio);
	this.engCapacity = engCapacity;
}

public Double getEngCapacity() {
	return engCapacity;
}

public void setEngCapacity(Double engCapacity) {
	this.engCapacity = engCapacity;
}

@Override
public String toString() {
	return "Motorcicle [engCapacity=" + engCapacity + "]";
}

@Override
public void runRoad() 
{
	// TODO Auto-generated method stub
	
}


public void tourAndShowMot() 
  {
	ArrayList<Motorcicle>ArrayListMot=new ArrayList<>();
	for(int i=0;i<ArrayListMot.size();i++) 
	{
		ArrayListMot.get(i).toString();
		
	}
	
  }

public Double UpdatePriceMot() {
	
	return super.getPrecio()*0.05;
	
}
}
