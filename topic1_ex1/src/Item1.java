//this class implements tembuilder for define new item1
public class Item1 implements ItemBuilder{
	private Item item;
	
	public Item1() {
		item = new Item();
	}
	@Override
	public void buildName() {
		item.setName("Motherboard INTEL");
		
	}

	@Override
	public void buildPrice() {
		item.setPrice(899.90);
		
	}

	@Override
	public Item getItem() {
		return item;
	}
	@Override
	public double getPrice() {
		return item.getPrice();
	}


}
