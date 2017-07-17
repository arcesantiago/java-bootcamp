// this class construct and return new item
public class ItemEngineer {
	private ItemBuilder itemBuilder;
	
	public ItemEngineer(ItemBuilder itemBuilder) {
		this.itemBuilder = itemBuilder;
	}
	
	public Item constructItem(){
		this.itemBuilder.buildName();
		this.itemBuilder.buildPrice();
		return this.itemBuilder.getItem();
	}

}
