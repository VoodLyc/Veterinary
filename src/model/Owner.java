package model;
import java.util.ArrayList;

public class Owner{

//Attributes

	private String name;
	private String id;
	private String address;
	private int phone;
	private ArrayList<Pet> pets;

//Constructor

	public Owner(String name, String id, String address, int phone){

		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		pets = new ArrayList<Pet>();
	}

//Gets

	public String getName(){

		return name;
	}

	public String getId(){

		return id;
	}

	public String getAddress(){

		return address;
	}

	public int getPhone(){

		return phone;
	}

	public ArrayList<Pet> getPets(){

		return pets;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setId(String id){

		this.id = id;
	}

	public void setAddress(String address){

		this.address = address;
	}

	public void setPhone(int phone){

		this.phone = phone;
	}

	public void setPets(ArrayList<Pet> pets){

		this.pets = pets;
	}

//Methods

	public void addPet(String name, int age, String type, double weight){

		pets.add(new Pet(name, age, type, weight));
	}

	public String showReportOwner(){

		String report = "";

		report += "The name of the owner is: " + name + "\n";
		report += "The id of the owner is: " + id + "\n";
		report += "The address of the owner is: " + address + "\n";
		report += "The phone of the owner is: " + phone + "\n";

		return report;
	}
}