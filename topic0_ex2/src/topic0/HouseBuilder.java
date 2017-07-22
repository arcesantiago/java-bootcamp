package topic0;

public interface HouseBuilder {
	//interface protoype methods
	HouseBuilder buildArea(double area);
	HouseBuilder buildAddress(String address);
	HouseBuilder buildStatus(String status);
	HouseBuilder buildColor(String color);
	HouseBuilder buildToilet(int toilet);
	HouseBuilder buildBedroom(int bedroom);
	HouseBuilder buildName();
	House getHouse();

}
