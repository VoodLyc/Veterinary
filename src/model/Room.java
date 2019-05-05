package model;

public class Room{

//Attributes

	private boolean availability;
	private Pet pet;
	private MedicalRecord record;

//Constructor

	public Room(boolean availability, Pet pet, MedicalRecord record){

		this.availability = availability;
		this.pet = pet;
		this.record = record;
	}

//Getters

	public boolean getAvailability(){

		return availability;
	}

	public Pet getPet(){

		return pet;
	}

	public MedicalRecord getRecord(){

		return record;
	}

//Setters

	public void setAvailability(boolean availability){

		this.availability = availability;
	}

	public void setPet(Pet pet){

		this.pet = pet;
	}

	public void setRecord(MedicalRecord record){

		this.record = record;
	}

//Methods

	public void setUpRoom(Pet pet, Owner owner, int status, Date entryDate, String symptoms, String diagnosis){

		pet = pet;
		availability = availability;
		record = new MedicalRecord(pet, owner, MedicalRecord.OPEN, entryDate, symptoms, diagnosis); 
	}

	public void emptyRoom(){

		availability = true;
		pet = null;
		record = null;
	}

	public String showFullReport(){

		String report = "";

		report += pet.showReportPet() + "\n";
		report += record.getEntryDate().showReportEntryDate() + "\n";
		report += record.showReportOfMedicalRecord() + "\n";
		report += record.showReportOfMedicines() + "\n";

		return report;
	}
}

