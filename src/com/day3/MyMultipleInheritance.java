package com.day3;

interface Parent1
{
	public void printParent1();
}
class Parent2
{
	public void printParent2()
	{
	System.out.println("Parent 2");
	}
}

class Child extends Parent2 implements Parent1
{
	public void printChild()
	{
		System.out.println("Child");
	}

	public void printParent1()
	{
		System.out.println("Parent 1");
	}
}

public class MyMultipleInheritance {
	
	public static void main(String args[])
	{
		Child child=new Child();
		child.printChild();
		child.printParent1();
		child.printParent2();
	}
}