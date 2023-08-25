package factory_design_pattern;

public class PaymentFactory {
	public Payment createPayment(String type) {
		 if (type.equalsIgnoreCase("creditcard")) {
	            return new CreditCardPayment();
	        } else if (type.equalsIgnoreCase("paypal")) {
	            return new PayPalPayment();
	        } else {
	            throw new IllegalArgumentException("Invalid payment type: " + type);
	        } 
		}
	
	public static void main(String[] args) {
		PaymentFactory paymentFactory = new PaymentFactory();
		 Payment createPayment = paymentFactory.createPayment("creditcard");
		 createPayment.makePayment(43243.99);
	}

}
