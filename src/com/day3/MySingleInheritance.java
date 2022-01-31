package com.day3;

class A
{
	public void printA()
	{
		System.out.println('A');
	}
}

class B extends A
{
	public void printB()
	{
		System.out.println('B');
	}
}

public class MySingleInheritance 
{
	public static void main(String args[])
	{
		B b=new B();
		b.printA();
		b.printB();
	}

}
