package ui;
import model.Date;
import model.HistoryOfMedicalRecords;
import model.MedicalRecord;
import model.Medicine;
import model.Owner;
import model.Pet;
import model.Veterinary;
import java.util.Scanner;

public class Main{

	private Veterinary veterinary;

//Constructor

	public Main(){

		veterinary = new Veterinary("Veterinary Clinic");
	}

	public static void main(String[]args){

		Main main = new Main();
		main.setUp();
		main.menu();
	}

	public static void setUp(){
		veterinary.setUpVeterinary();
	}

	public void menu(){

	Sytem.out.print("Welcome to the software of My Little Pet veterinary clinic\n");

	    boolean running = true;
		boolean asking = false;
		Scanner reader = new Scanner(System.in);

		while(running){

			System.out.println("Please choose an option pressing the number related with the option do you want:");
			System.out.println("1. Register a new owner and its pet.");
			System.out.println("2. Hospitalize a pet");
			System.out.println("3. ")
		}
	}
}