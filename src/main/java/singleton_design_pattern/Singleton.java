package singleton_design_pattern;

public class Singleton {
	/*
	 * 
Certainly! The Singleton Design Pattern ensures that a class has only one instance 
and provides a global point of access to that instance. 
This pattern is often used for classes that manage resources that should be 
shared among multiple parts of an application.
	 */

	private static Singleton instance;
	
	
	
	// Private constructor to prevent instantiation from other classes
	private Singleton() {
		// write code if you want
	}
	
	// Public method to provide access to the instance
	public static Singleton getInstance() {
		if (instance == null) {
			
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
			
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Gangadaran");

	}
}
