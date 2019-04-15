package model;
import java.util.ArrayList;

public class Owner{

//Attributes

	private String name;
	private String id;
	private String address;
	private int phone;
	private ArrayList<Pet> pet;

//Constructor

	public Owner(String name, String id, String address, int phone, Pet pet){

		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.pet = new ArrayList<Pet>();
		this.pet.add(pet);
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

	public ArrayList<Pet> getPet(){

		return pet;
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

	public void setPet(ArrayList<Pet> pet){

		this.pet = pet;
	}
}