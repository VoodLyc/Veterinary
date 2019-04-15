package model;
import java.util.ArrayList;

public class Pet{

//Constants

	public final static String CAT = "C";
	public final static String DOG = "D";
	public final static String BIRD = "B";
	public final static String OTHER = "O";

//Attributes

	private String name;
	private int age;
	private char type;
	private double weight;
	private ArrayList<History> history;

//Constructor

	public Pet(String name, int age, char type, double weight){

		this.name = name;
		this.age = age;
		this.type = type;
		this.weight = weight;
		this.history = new ArrayList<History>();
	}

//Gets

	public String getName(){

		return name;
	}

	public int getAge(){

		return age;
	}

	public char getType(){

		return type;
	}

	public double getWeight(){

		return weight;
	}

	public ArrayList<History> getHistory(){

		return history;
	}

//Sets

	public void setName(String name){

		this.name = name;
	}

	public void setAge(int age){

		this.age = age;
	}

	public void setType(char type){

		this.type = type;
	}

	public void setWeight(double weight){

		this.weight = weight;
	}

	public void setHistory(ArrayList<History> history){

		this.history = history;
	}

}