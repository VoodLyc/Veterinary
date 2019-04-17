package model;

public class Room{

//Attributes

	private int numberRoom;
	private Pet pet;
	private History actualHistory;
	private Date actualDate;

//Constructor

	public Room(int numberRoom, Pet pet, History actualHistory, Date actualDate){

		this.numberRoom = numberRoom;
		this.pet = pet;
		this.actualHistory = actualHistory;
		this.actualDate = actualDate;
	}

//Gets

	public int getNumberRoom(){

		return numberRoom;
	}

	public Pet getPet(){

		return pet;
	}

	public History getActualHistory(){

		return actualHistory;
	}

	public Date getActualDate(){

		return actualDate;
	}

//Sets

	public void setNumberRoom(int numberRoom){

		this.numberRoom = numberRoom;
	}

	public void setPet(Pet pet){

		this.pet = pet;
	}

	public void setActualHistory(History actualHistory){

		this.actualHistory = actualHistory;
	}

	public void setActualDate(Date actualDate){

		this.actualDate = actualDate;
	}
}

