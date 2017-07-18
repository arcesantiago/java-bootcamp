package topic0;

public class HouseEngineer {
	 // private instance variable, not accessible from outside this class
	private HouseBuilder houseBuilder;
	//The default constructor whit given houseBuilder
	public HouseEngineer (HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	//a method to construc a set and return a new house type
	public House ConstructHouse(){
		
		this.houseBuilder.buildArea();
		this.houseBuilder.buildAddress();
		this.houseBuilder.buildStatus();
		this.houseBuilder.buildColor();
		this.houseBuilder.buildToilet();
		this.houseBuilder.buildBedroom();
		return this.houseBuilder.getHouse();
		
	}

}
