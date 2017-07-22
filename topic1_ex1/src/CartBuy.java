//this class is for make a buy and sign in
public class CartBuy {
	Cart cart;
	PaymentContext paymentContext;// create a new payment context to sets and gets witch payment use
    PaymentStrategy paymentStrategy;// new paymentstrategy to create a new payment
    int count;
    //define constructor whit default values
	public CartBuy(Cart cart) {
		this.cart = cart;
		this.count = 0;
		paymentContext = null;
	    paymentStrategy= null;
	}
	//method for buy by creditcard whit to arguments name and code
	public double buyCreditCard(String name, String code){
		Login login = new LoginCreditCard();// new loginCreditCard
		if(login.signIn(name,code)){//convalidating name and code of credit card
			this.paymentStrategy = new PaymentCreditCard();// create a new paymentcreditcard
			this.paymentContext = new PaymentContext(this.cart, this.paymentStrategy);//buy this cart whit credit card
			System.out.println("Logged In");
		}
		System.out.println("Correct transaction");
		count++;//raise counter
		return paymentStrategy.pay(this.cart);//return the amount whit discount

	}
	//method for buy by paypal
	public double buyPayPal(String email,String password){
			Login login1 = new LoginPaypal();//new loginpaypal
			if(login1.signIn(email,password)){ //validate arguments
			this.paymentStrategy = new PaymentPayPal();// create paypal payment
			this.paymentContext = new PaymentContext(this.cart, this.paymentStrategy);//buy this cart whit paypal
			System.out.println("Logged In");
			}
			System.out.println("Correct transaction");
			count++;//raise counter
			return paymentStrategy.pay(this.cart);
	 }
	//method for buy whit cash
	public double buyCash(){
		this.paymentStrategy = new PaymentCash();//new paymentcash
		this.paymentContext = new PaymentContext(this.cart, paymentStrategy);//buy this cart whit cash
		System.out.println("Correct transaction");
		count++;//raise counter
		return this.paymentStrategy.pay(this.cart);
	}
	//method for return counter
	public int getCount(){
		return this.count;
	}
}
