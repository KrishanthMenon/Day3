package com.day3;

class Parent
{
	public void printParent()
	{
		System.out.println("Parent");
	}
}

class Child1 extends Parent
{
	public void printChild1()
	{
		System.out.println("Child1");
	}
}

class Child2 extends Parent
{
	public void printChild2()
	{
		System.out.println("Child2");
	}
}

public class MyHierarchicalInheritance 
{
	public static void main(String args[])
	{
		Child1 child1=new Child1();
		child1.printParent();
		child1.printChild1();
		
		Child2 child2=new Child2();
		child2.printParent();
		child2.printChild2();
	}

}
