package model;

import java.time.LocalDate;

public class Person
{
	private String name;
	private int geb;
	private char gesch;
	private String adresse;
	
	//------------------
	
	public Person (String name, int geb, char gesch)
	{
		setName(name);
		setGeb(geb);
		setGesch(gesch);
	}
	
	//------------------
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getGeb()
	{
		return geb;
	}

	public void setGeb(int geb)
	{
		this.geb = geb;
	}

	public char getGesch()
	{
		return gesch;
	}

	public void setGesch(char gesch)
	{
		this.gesch = gesch;
	}

//---------------------------
	


	public int berechneAlter()
	{
		return LocalDate.now().getYear() - geb;
	}

	@Override
	public String toString()
	{
		return "Person name=" + name + ", geb=" + geb + ", gesch=" + gesch + ", adresse=" + adresse
				+ ", Alter=" + berechneAlter() + "]";
	}
	
	

}
