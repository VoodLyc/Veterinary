package model;
import java.util.ArrayList;

public class Veterinary{

//Constants

	public final static int AMOUNT_OF_ROOMS = 8;

//Attributes

	private String name;
	private Room[] room;
	private ArrayList<Owner> owner;

//Constructor

	public Veterinary(String name){

		this.name = name;
		this.room = new Room[AMOUNT_OF_ROOMS];
		this.owner = new ArrayList<Owner>();
	}

//Gets

	public String getName(){
		
		return name;
	}

	public Room getRoom(int n){
		
		return room[n];
	}

	public ArrayList<Owner> getOwner(){

		return owner;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setRoom(int n){

		this.room[n] = room[n];
	}

	public void setOwner(ArrayList<Owner> owner){

		this.owner = owner;
	}

}