/*Maya Sorensen Programming Project 2 SingleFamilyHome class extends Residential class
 * Uses residential class to create a type of building, a Single Family Home
 * uses super method to use variables from residential
 */

public class SingleFamilyHome extends Residential{

	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		garage = false;
	}//empty argument constructor 
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//preferred constructor
	
	//getters and setters
	public boolean isGarage() {
		return garage;
	}
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	//end getters and setters
	
	public void draw() {
		System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}//clarifies what will be displayed 
	
	public String displayData() {
		String display =  "Project Name: " + projectName + " Full Address: " + completeAddress+ " SquareFeet: " + totalSquareFeet + " Occupancy group: " + occupancyGroup + " Subgroup: " + subgroup + " There is a garage: " + garage +  " Number of Bedrooms: " + numBedroom + " Number of Bathrooms: " + numBathroom + " Is there a Laundry Room: " + laundryRoom;
		return display;
	}//displays data about a single family home
	
}
