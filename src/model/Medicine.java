package model;

public class Medicine{

//Attributes

	private String name;
	private String dose;
	private double costPerDose;
	private double frequency;

//Constructor

	public Medicine(String name, String dose, double costPerDose, double frequency){

		this.name = name;
		this.dose = dose;
		this.costPerDose = costPerDose;
		this.frequency = frequency;
	}

//Gets

	public String getName(){

		return name;
	}

	public String getDose(){

		return dose;
	}

	public double getCostPerDose(){

		return costPerDose;
	}

	public double getFrequency(){

		return frequency;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setDose(String dose){

		this.dose = dose;
	}

	public void setCostPerDose(double costPerDose){

		this.costPerDose = costPerDose;
	}

	public void setFrequency(double frequency){

		this.frequency = frequency;
	}
}
