package topic0;

public class ChaleHouse implements HouseBuilder{
	 // private instance variable, not accessible from outside this class
	private House house;
	
	public ChaleHouse() {
		this.house = new House();
	}

	@Override
	public void buildArea() {
		house.setArea(155.54);
		
	}

	@Override
	public void buildAddress() {
		house.setAddress("Bv. oroño 444");
		
	}

	@Override
	public void buildStatus() {
		house.setStatus("on sale");
		
	}

	@Override
	public void buildColor() {
		house.setColor("white");
		
	}

	@Override
	public void buildToilet() {
		house.setToilet(5);
		
	}

	@Override
	public void buildBedroom() {
		house.setBedroom(10);
		
	}
	//end setters
	// Return a description of this instance
	@Override
	public House getHouse() {
		return house;
	}

}
