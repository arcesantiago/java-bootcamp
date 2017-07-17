
public class Test {
	public static void main(String[] args) {
		Cart cart = new Cart();// test new cart
		CartBuy cartBuy = new CartBuy(cart); //test new cart buy
		int key = 2; // key to switch
		
		ItemBuilder item1 = new Item1();// new item1
		ItemEngineer engineer1 = new ItemEngineer(item1);//new engineer for construct a new item1
		Item motherboard = engineer1.constructItem();//construct new item
		
		ItemBuilder item2 = new Item2();// new item2
		ItemEngineer engineer2 = new ItemEngineer(item2);
		Item apuA10 = engineer2.constructItem();
		
		cart.addItem(motherboard);//test add item to cart
		cart.addItem(apuA10);//test add item to cart
		//play screen
		System.out.println("Cart items:\n"+cart.getCart());
    	System.out.println("\nAmount Total: "+cart.getTotal());
    	System.out.println("\nChoose payment method:");
        System.out.println("1. CreditCard");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        //select payment method
	    switch (key) {
	        case 1: System.out.println("Total amount whit Credit Card: "
	        					+cartBuy.buyCreditCard("santiago","20047419902013nw"));
	                	break;
	        case 2: System.out.println("Total amount whit PayPal: "
	                			+cartBuy.buyPayPal("santiago@hotmail.com","football123"));
	                    break;
	        case 3: System.out.println("Total amount whit cash: "
	                    			+cartBuy.buyCash());
	                    break;
	        default: System.exit(0);
	                    break;
	            }
	    System.out.println("Numbers of transactions: "+cartBuy.getCount());// test count
	}
}
