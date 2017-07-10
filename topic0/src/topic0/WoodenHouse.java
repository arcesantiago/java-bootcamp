package topic0;

public class WoodenHouse implements HouseBuilder {
	 // private instance variable, not accessible from outside this class
	private House house;
	//Setters
	public WoodenHouse() {
		this.house = new House();
	}

	@Override
	public void buildArea() {
		house.setArea(189.21);
		
	}

	@Override
	public void buildAddress() {
		house.setAddress("Alvear 1111");
		
	}

	@Override
	public void buildStatus() {
		house.setStatus("to rent");
		
	}

	@Override
	public void buildColor() {
		house.setColor("brown");
		
	}

	@Override
	public void buildToilet() {
		house.setToilet(3);
		
	}

	@Override
	public void buildBedroom() {
		house.setBedroom(05);
		
	}
	//end setters
	// Return a description of this instance
	@Override
	public House getHouse() {
		return house;
	}

}
