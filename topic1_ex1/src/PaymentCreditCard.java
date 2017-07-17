//payment creditcard implements payment strategy for redefine pay method
public class PaymentCreditCard implements PaymentStrategy{
	// computing discount %10 of total
	public double pay(Cart cart) {
		double amount = cart.getTotal() * 0.10;
		return cart.getTotal() - amount;
		
	}

}
