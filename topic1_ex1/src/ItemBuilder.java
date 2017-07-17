//interface to sets and gets new item using a builder pattern
public interface ItemBuilder {
	void buildName();
	void buildPrice();
	double getPrice();
	Item getItem();

}
