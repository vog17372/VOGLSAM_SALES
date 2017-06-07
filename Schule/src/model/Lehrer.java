package model;

import java.time.LocalDate;

public class Lehrer extends Person
{

	private int eintritt; 
	
	//-----------------------
	public Lehrer(String name, int geb, char gesch, int eintritt )
	{
		super(name, geb, gesch);
		setEintritt(eintritt);
	}
	
	//-----------------------
	public int getEintritt()
	{
		return eintritt;
	}
	
	public void setEintritt(int eintritt)
	{
		this.eintritt = eintritt;
	}
	
	//----------------------

	public String toString()
	{
		return "Lehrer: " + super.toString();
	}
	
	public int berechneDienstalter()
	{
		return LocalDate.now().getYear() - eintritt;
	}
}
