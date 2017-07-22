//this class implements tembuilder for define new item2
public class Item2 implements ItemBuilder {
	private Item item;
	
	public Item2() {
		item = new Item();
	}

	@Override
	public void buildName() {
		item.setName("APU A10");
		
	}

	@Override
	public void buildPrice() {
		item.setPrice(2013.74);
		
	}
	
	@Override
	public double getPrice() {
		return item.getPrice();
	}

	@Override
	public Item getItem() {
		return item;
	}

	

}
