package topic0;

public class ChaleHouse implements HouseBuilder{
	 // private instance variable, not accessible from outside this class
	private House house;
	
	public ChaleHouse() {
		this.house = new House();
	}

	@Override
	public HouseBuilder buildArea(double area) {
		house.setArea(area);
		return this;
	}

	@Override
	public HouseBuilder buildAddress(String address) {
		house.setAddress(address);
		return this;
	}

	@Override
	public HouseBuilder buildStatus(String status) {
		house.setStatus(status);
		return this;
	}

	@Override
	public HouseBuilder buildColor(String color) {
		house.setColor(color);
		return this;
	}

	@Override
	public HouseBuilder buildToilet(int toilet) {
		house.setToilet(toilet);
		return this;
	}

	@Override
	public HouseBuilder buildBedroom(int bedroom) {
		house.setBedroom(bedroom);
		return this;
	}
	@Override
	public HouseBuilder buildName() {
		house.setName("ChaleHouse");
		return this;
		}
	//end setters
	// Return a description of this instance
	@Override
	public House getHouse() {
		return house;
	}

}
