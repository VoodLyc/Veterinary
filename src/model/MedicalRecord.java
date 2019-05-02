package model;
import java.util.ArrayList;

public class MedicalRecord{

//Constants

	public static final int CLOSED = 0;
	public static final int OPEN = 1;

//Attributes

	private Pet pet;
	private Owner owner;
	private int status;
	private Date entryDate;
	private String symptoms;
	private String diagnosis;
	private ArrayList<Medicine> medicines;

//Constructor

	public MedicalRecord(Pet pet, Owner owner, int status, Date entryDate, String symptoms, String diagnosis){

		this.pet = pet;
		this.owner = owner;
		this.status = status;
		this.entryDate = entryDate;
		this.symptoms = symptoms;
		this.diagnosis = diagnosis;
		medicines = new ArrayList<Medicine>();
	}

//Getters

	public Pet getPet(){

		return pet;
	}

	public Owner getOwner(){

		return owner;
	}

	public int getStatus(){

		return status;
	}

	public Date getEntryDate(){

		return entryDate;
	}

	public String getSymptoms(){

		return symptoms;
	}

	public String getDiagnosis(){

		return diagnosis;
	}

	public ArrayList<Medicine> getMedicines(){

		return medicines;
	}

//Setters

	public void setPet(Pet pet){

		this.pet = pet;
	}

	public void setOwner(Owner owner){

		this.owner = owner;
	}

	public void setStatus(int status){

		this.status = status;
	}

	public void setEntryDate(Date entryDate){

		this.entryDate = entryDate;
	}

	public void setSymptoms(String symptoms){

		this.symptoms = symptoms;
	}

	public void setDiagnosis(String diagnosis){

		this.diagnosis = diagnosis;
	}

	public void setMedicines(ArrayList<Medicine> medicines){

		this.medicines = medicines;
	}

}