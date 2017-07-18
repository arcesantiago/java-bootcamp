package topic0;

public class House {
	House house;
	 // private instance variable, not accessible from outside this class
	private double area;
	private String address;
	private String status;
	private String color;
	private int toilet;
	private int bedroom;
	private String name;
	//Setters
	public void setArea(double area){
		this.area = area;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setToilet(int toilet){
		this.toilet = toilet;
	}
	
	public void setBedroom(int bedroom){
		this.bedroom = bedroom;
	}
	public void setName(String name){
		this.name = name;
	}
	//end setters
	// Return a description of this instance
	public String toString(){
		return name + " [Address=" + address + " ,Area=" + area
				+ " ,Status=" + status + ", Color=" + color + ",Toilet=" + toilet + " ,Bedroom" + bedroom + "]";
	}

}
