package factory_design_pattern;

public interface Payment {
	
	/*
	 * Certainly! The Factory Design Pattern is a creational design pattern that provides 
	 * an interface for creating objects in a superclass, 
	 * but allows subclasses to alter the type of objects that will be created. 
	 * It promotes loose coupling by abstracting the process of object creation.
	 */
	
	void makePayment(double amount);

}
