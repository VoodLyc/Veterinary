package model;
import java.util.ArrayList;

public class History{

//Attributes

	private boolean status;
	private String symptom;
	private String diagnosis;
	private String ownerName;
	private String ownerId;
	private String petName;
	private Date datea;
	private ArrayList<Medicine> medicine;

//Constructor

	public History(boolean status, String symptom, String diagnosis, String ownerName, String ownerId, String petName, Date datea){

		this.status = status;
		this.symptom = symptom;
		this.diagnosis = diagnosis;
		this.ownerName = ownerName;
		this.ownerId = ownerId;
		this.petName = petName;
		this.datea = datea;
	}

//Gets

	public boolean getStatus(){

		return status;
	}

	public String getSymptom(){

		return symptom;
	}

	public String getDiagnosis(){

		return diagnosis;
	}

	public String getOwnerName(){

		return ownerName;
	}

	public String getOwnerId(){

		return ownerId;
	}

	public Date getDateA(){

		return datea;
	}

	public ArrayList<Medicine> getMedicine(){

		return medicine;
	}

//Sets

	public void setStatus(boolean status){

		this.status = status;
	}

	public void setSyptom(String symptom){

		this.symptom = symptom;
	}

	public void setDiagnosis(String diagnosis){

		this.diagnosis = diagnosis;
	}

	public void setOwnerName(String ownerName){

		this.ownerName = ownerName;
	}

	public void setOwnerId(String ownerId){

		this.ownerId = ownerId;
	}

	public void setMedicine(ArrayList<Medicine> medicine){

		this.medicine = medicine;
	}
}