package model;
import java.util.ArrayList;

public class HistoryOfMedicalRecords{

//Attributes

	private String petName;
	private ArrayList<MedicalRecord> records;

//Constructor

	public HistoryOfMedicalRecords(String petName){

		this.petName = petName;
		records = new ArrayList<MedicalRecord>();
	}

//Getters

	public String getPetName(){

		return petName;
	}

	public ArrayList<MedicalRecord> getRecords(){

		return records;
	}

//Setters

	public void setPetName(String petName){

		this.petName = petName;
	}

	public void setRecords(ArrayList<MedicalRecord> records){

		this.records = records;
	}

//Methods 

	public void addMedicalRecord(MedicalRecord record){

		records.add(record);
	}
}