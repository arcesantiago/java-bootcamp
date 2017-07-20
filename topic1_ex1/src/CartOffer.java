import java.util.ArrayList;
//this method gets and sets a new Offer
public class CartOffer {
	ArrayList<Item> offer;
	
	public CartOffer() {
		this.offer = new ArrayList<>();
	}
	
	public void addItemOffer(Item item){
		offer.add(item);
	}
	
	public void deleteLastItem(){
		offer.remove(offer.size());
	}
	
	public ArrayList<Item> getOffer(){
		return this.offer;
	}
	
	public String toString(){
		return "Happy Hour, 50% discount in:\n" + offer;
	}

}
