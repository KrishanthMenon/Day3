package com.day3;

class W
{
	public void printA()
	{
		System.out.println("A");
	}
}

class X extends W
{
	public void printB()
	{
		System.out.println("B");
	}
}

class Y extends X
{
	public void printC()
	{
		System.out.println("C");
	}
}

class Z extends Y
{
	public void printD()
	{
		System.out.println("D");
	}
}

public class MyMultilevelInheritance 
{
	public static void main(String args[])
	{
		Z d=new Z();
		d.printA();
		d.printB();
		d.printC();
		d.printD();
	}

}
