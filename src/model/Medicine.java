package model;

public class Medicine{

//Attributes

	private String name;
	private String dose;
	private int frequency;

//Constructor

	public Medicine(String name, String dose, int frequency){

		this.name = name;
		this.dose = dose;
		this.frequency = frequency;
	}

//Gets

	public String getName(){

		return name;
	}

	public String getDose(){

		return dose;
	}

	public int getFrequency(){

		return frequency;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setDose(String dose){

		this.dose = dose;
	}

	public void setFrequency(int frequency){

		this.frequency = frequency;
	}
}
