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

	public void setUpVeterinary(){
		
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

/**
	*This method allows checking if the room is available (No pets are hospitalized in that room)<br>

	*<b>pre:</b> The room cannot be null<br>

	*<b>post:</b> The status of the room was checked<br>

	*@param i Is the number of the room you want to check<br>

	*@return The status of the room (Whether it is available or not)<br>
*/
	public boolean checkIfTheRoomIsAvailable(int numberOfRoom){

		boolean success = false;

			if(rooms[numberOfRoom].getAvailability() == true){
 
				success = true;
			}
		
			return success;
		}

	public String hospitalizePet(Pet pet, Owner owner, int status, Date entryDate, String symptoms, String diagnosis, int numberOfRoom, String name, String dose, double costPerDose, double frequency){

		String petName = "";
		String message = "The pet couldn't hospitalized";

		if(pet != null){

			if(checkIfTheRoomIsAvailable(numberOfRoom) == true){

				rooms[numberOfRoom].setUpRoom(pet, owner, status, entryDate, symptoms, diagnosis);

				petName = pet.getName();
				addMedicine(name, dose, costPerDose, frequency, petName);
				addHistoryOfMedicalRecords(petName);
				addMedicalRecord(petName);
				message = "The pet was hospitalized";
			}
		}

		return message;
	}

	public String showFullReport(){

		String report = "";

		for(int i = 0; i < AMOUNT_OF_ROOMS; i++){

			if(rooms[i].getPet() != null){

				report += rooms[i].showFullReport() + "\n";

			}
		}

		return report;
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
					if (success == false){
						report = "The pet couldn't be found. Please try again with another name or make sure you wrote it correctly.";	
					}
				}
			}

		return report;
	}

	public void addHistoryOfMedicalRecords(String petName){

		histories.add(new HistoryOfMedicalRecords(petName));
	}

	public boolean addMedicalRecord(String petName){

		boolean success = false;
		MedicalRecord record = null;

		for(int i = 0; i < AMOUNT_OF_ROOMS; i++){
			
			if(rooms[i].getPet().getName().equals(petName)){

				record = rooms[i].getRecord();

			 if(record != null){

			for(int j = 0; j < histories.size(); j++){

				if(histories.get(j).getPetName().equals(petName)){
				
				histories.get(j).addMedicalRecord(record);
				success = true;
			}
		}
	}
}
}
	return success;	
}

	public boolean saveMedicalRecordInHistoryOfMedicalRecordsIfTheHistory(String petName){

		boolean success = false;
		MedicalRecord record = null;

		if(addMedicalRecord(petName) == true){

			success = true;
		}
		else{

			for(int i = 0; i < AMOUNT_OF_ROOMS; i++){

				if(rooms[i].getPet().getName().equals(petName)){

				record = rooms[i].getRecord();

				if(record != null){

					addHistoryOfMedicalRecords(petName);

					for(int j = 0; j < histories.size(); j++){

						if(histories.get(j).getPetName().equals(petName)){

							histories.get(j).addMedicalRecord(record);
							success = true;
						}
					}
				
			}
		}
	}
}
	return success;
}

	public String showOwnerDataWithOwnerNameOrPetName(String name){

		boolean success = false;
		String report = "";

		for(int i = 0; i < owners.size() && success != true; i++){

			if(owners.get(i).getName().equals(name)){

				report = owners.get(i).showReportOwner();
				success = true;
			}
			else 
				report = owners.get(i).showReportOfOwnerWithPetName(name);
		}

		if(report.equals("")){

			report = "No pets or owners were found with that name. Please try again with another name or make sure you wrote it correctly.";
		}

		return report;
	}
}

