package model;
import java.util.ArrayList;

public class Veterinary{

//Constants

	public static final int AMOUNT_OF_ROOMS = 8;

//Attributes

	private String name;
	private Room[] rooms;
	private ArrayList<Owner> owners;
	private ArrayList<HistoryOfMedicalRecords> histories;

//Constructor

	public Veterinary(String name){

		this.name = name;
		rooms = new Room[AMOUNT_OF_ROOMS];
		owners = new ArrayList<Owner>();
		histories = new ArrayList<HistoryOfMedicalRecords>();
	}

//Gets

	public String getName(){
		
		return name;
	}

	public ArrayList<Owner> getOwner(){

		return owners;
	}

	public ArrayList<HistoryOfMedicalRecords> getHistories(){

		return histories;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setOwner(ArrayList<Owner> owners){

		this.owners = owners;
	}

	public void setHistories(ArrayList<HistoryOfMedicalRecords> histories){

		this.histories = histories;
	}

//Methods

	public void addOwner(String name, String id, String address, int phone){
		owners.add(new Owner(name, id, address, phone));
	}

	public void addPet(String name, int age, String type, double weight, String ownerId){
		
		boolean itWasFound = false;

		for (int i = 0; i > owners.size() && itWasFound != true; i++){

			if(owners.get(i).getId().equals(ownerId)){

				owners.get(i).addPet(name, age, type, weight);
				
				itWasFound = true;
				
				}		
		}
	}

	public void initializeTheRooms(){
		
		for(int i = 0; i < AMOUNT_OF_ROOMS; i++){

			rooms[i] = new Room(true, null, null);
		}
	}

	public boolean addMedicine(String name, String dose, double costPerDose, double frequency, String petName){
		
		boolean success = false;

		for(int i = 0; i < AMOUNT_OF_ROOMS && success != true; i++){

			if(!rooms[i].getAvailability()){
				if(rooms[i].getPet().getName().equals(petName)){
					rooms[i].getRecord().getMedicines().add(new Medicine(name, dose, costPerDose, frequency));

					success = true;
				}
			}
		}
			
			return success;
	}

	public String checkIfTheRoomIsAvailable(int number){

		String message = "The room isn't available";

			if(rooms[number].getAvailability() == true){
 
				message = "The room is available";
			}
		
			return message;
		}

	public String hospitalizePet(Pet pet, Owner owner, int status, Date entryDate, String symptoms, String diagnosis, int numberOfRoom){

		String message = "The pet couldn't hospitalized";

		if(pet != null){
		
		rooms[numberOfRoom].setUpRoom(pet, owner, status, entryDate, symptoms, diagnosis);

		message = "The pet was hospitalized";

		}

		return message;
	}

		public boolean unlikPetOfTheRoom(String petName){

		boolean success = false;
		MedicalRecord record;

		for(int i = 0; i < AMOUNT_OF_ROOMS && success != true; i++){

			if(rooms[i].getPet().getName().equals(petName)){

			for(int j = 0; j < histories.size() && success != true; j++){
				
				if(histories.get(j).getPetName().equals(petName)){

				record = rooms[i].getRecord();
				histories.get(j).addMedicalRecord(record);
				rooms[i].emptyRoom();
				success = true;
				}
			}
		}
	}

		return success;
	}

	public String dischargeThePetFromTheVeterinary(String petName){
		
		boolean success = false;
		String report = "";
		
		if(unlikPetOfTheRoom(petName) == true){

			for(int i = 0; i < AMOUNT_OF_ROOMS && success != true; i++){

				if(rooms[i].getPet().getName().equals(petName)){

					report = "MEDICAL RECORD: " + "\n";
					report += rooms[i].showFullReport();
					success = true;
				}
				else{

					report = "The pet couldn't be found. Please enter the name again and make sure it's the right one.";
				}
			}
		}

		return report;
	}
}
