package factory_design_pattern;

public class CreditCardPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		 System.out.println("Made credit card payment of $" + amount);
		
	}

}
