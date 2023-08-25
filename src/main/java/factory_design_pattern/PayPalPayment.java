package factory_design_pattern;

public class PayPalPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		 System.out.println("Made PayPal payment of $" + amount);
		
	}

}
