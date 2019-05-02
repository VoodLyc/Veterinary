package model;

public class Date{

//Attributes

	private int day;
	private int month;
	private int year;

//Constructor

	public Date(int day, int month, int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

//Gets

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{
		return month;
	}

	public int getYear()
	{
		return year;
	}

//Sets

	public void setDay(int day)
	{
		this.day = day;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public void setYear(int year)
	{
		this.year = year;
	}
}