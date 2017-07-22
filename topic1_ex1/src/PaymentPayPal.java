//paymentpaypal implements payment strategy for redefine pay method
public class PaymentPayPal implements PaymentStrategy{
	//computing discount
	//The cheapest item is for free when the user pay by Paypal
	@Override
	public double pay(Cart cart) {
		double min = cart.getCart().get(0).getPrice();
		for (int i = 0; i < cart.getCart().size(); i++) {
			if(cart.getCart().get(i).getPrice() < min){
				min = cart.getCart().get(i).getPrice();
			}
			
		}
		return cart.getTotal() - min;
	}

}
