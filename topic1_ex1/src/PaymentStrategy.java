//interface to define payment method whit strategy pattern
public interface PaymentStrategy {
	public double pay(Cart cart);

}
