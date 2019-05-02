package model;
import java.util.ArrayList;

public class Veterinary{

//Constants

	public static final int AMOUNT_OF_ROOMS = 8;

//Attributes

	private String name;
	private Room[] rooms;
	private ArrayList<Owner> owners;

//Constructor

	public Veterinary(String name){

		this.name = name;
		this.rooms = new Room[AMOUNT_OF_ROOMS];
		this.owners = new ArrayList<Owner>();
	}

//Gets

	public String getName(){
		
		return name;
	}

	public Room getRoom(int n){
		
		return rooms[n];
	}

	public ArrayList<Owner> getOwner(){

		return owners;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setRoom(int n){

		this.rooms[n] = rooms[n];
	}

	public void setOwner(ArrayList<Owner> owners){

		this.owners = owners;
	}

//Methods
 
	public boolean hospitalizationService(){

	}

/**
	*This method allows checking if the room is available (No pets are hospitalized in that room)<br>

	*<b>pre:</b> The room cannot be null<br>

	*<b>post:</b> The status of the room was checked<br>

	*@param i Is the number of the room you want to check<br>

	*@return The status of the room (Whether it is available or not)<br>
*/	
	public boolean checkIfTheRoomIsAvailable(int i){
	}

}