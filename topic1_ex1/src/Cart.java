import java.util.ArrayList;
//this class is for sets and gets new cart
public class Cart {
	private ArrayList<Item> cart;
	private double mount;
	
	public Cart(){
		cart = new ArrayList<>();
		mount = 0;
	}
	
	public void addItem(Item item){
		cart.add(item);
		this.mount = item.getPrice() + this.mount;
	}
	
	public void deleteItem(){
		mount = mount - cart.get(cart.size()).getPrice();
		cart.remove(cart.size());
	}
	
	public double getTotal(){
		return mount;
	}
	
	public ArrayList<Item> getCart(){
		return cart;
	}
}
