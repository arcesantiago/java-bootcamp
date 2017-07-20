//this class sets and gets new paymentstrategy 
public class PaymentContext {
	Cart cart;
	PaymentStrategy strategy;

	public PaymentContext(Cart cart, PaymentStrategy strategy) {
		this.cart = cart;
		this.strategy = strategy;
	}

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double getResult(){
		return strategy.pay(this.cart);
	}

}
