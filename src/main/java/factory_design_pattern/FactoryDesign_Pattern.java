package factory_design_pattern;

public class FactoryDesign_Pattern {
	
	/*
	 * Design patterns are typical solutions to commonly occurring problems in software design. 
	 * They are like pre-made blueprints that you can customize to solve a recurring design problem 
	 * in your code.
	 */
	
	
	public void startApp(String browser) {
		switch(browser) {
		case "chrome": System.out.println("Chrome browser");  break;
		case "edge": System.out.println("Edge browser"); break;
		default: System.out.println("browser is not valid");
			
		}

	}
	
	
	public static void main(String[] args) {
		FactoryDesign_Pattern factory = new FactoryDesign_Pattern();
		factory.startApp("chrome");
	}

}
