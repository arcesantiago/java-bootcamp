//this class sets and gets new item
public class Item {
	private String name;
	private double price;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString(){
		return "Item[Name=" + name + " ,Price " + price + "]";
	}

	

}
