package com.day3;

abstract class Car
{
	abstract public void mileage();
	abstract public void topspeed();
}

class Mustang extends Car
{
	public void mileage()
	{
		System.out.println("7 kmpl");
	}
	public void topspeed()
	{
		System.out.println("450 kmph");
	}
	public void fuel()
	{
		System.out.println("Gasoline");
	}
}

class Challenger extends Car
{
	public void mileage()
	{
		System.out.println("10 kmpl");
	}
	public void topspeed()
	{
		System.out.println("420 kmph");
	}
	public void fuel()
	{
		System.out.println("Diesel");
	}
}

public class MyAbstraction 
{
	public static void main(String args[])
	{
		Mustang ford=new Mustang();
		ford.mileage();
		ford.topspeed();
		ford.fuel();
		
		System.out.println();
		Challenger dodge=new Challenger();
		dodge.mileage();
		dodge.topspeed();
		dodge.fuel();
	}
}





