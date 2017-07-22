//PaymentCash implements payment strategy for redefine pay method
public class PaymentCash implements PaymentStrategy {
	//computing discount
	//90% of the most expensive item is free if the user pays by Cash
	@Override
	public double pay(Cart cart) {
		double max = cart.getCart().get(0).getPrice();
		for (int i = 0; i < cart.getCart().size(); i++) {
			if(cart.getCart().get(i).getPrice() > max){
				max = cart.getCart().get(i).getPrice();
			}
			
	}
		max = max * 0.9;
		return cart.getTotal() - max;
}
	}
