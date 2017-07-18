package topic0;

public class HouseEngineer {
	 // private instance variable, not accessible from outside this class
	private HouseBuilder houseBuilder;
	//The default constructor whit given houseBuilder
	public HouseEngineer (HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	//a method to construct a set and return a new house type
	public House ConstructHouse(){
		
		return houseBuilder.buildArea(266.5)
		.buildAddress("ov lagos 111")
		.buildBedroom(2)
		.buildColor("red")
		.buildStatus("on sale")
		.buildToilet(3)
		.buildName()
		.getHouse();
		
	}

}
