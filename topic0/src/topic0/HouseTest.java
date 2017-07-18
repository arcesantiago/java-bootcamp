package topic0;

public class HouseTest {
	public static void main(String[] args) {
		//test build pattern
		HouseBuilder woodenHouse = new WoodenHouse();// test new woodenHouse
		HouseEngineer engineer1 = new HouseEngineer(woodenHouse);//test new engineer
		House house1 = engineer1.ConstructHouse(); //test engineer construct new house 
		
		System.out.println(house1);// test toString()
		
		HouseBuilder chaleHouse = new ChaleHouse();
		HouseEngineer engineer2 = new HouseEngineer(chaleHouse);
		House house2 = engineer2.ConstructHouse();
		
		System.out.println(house2);// test toString()
	}

}
