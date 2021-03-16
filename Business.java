/*Maya Sorensen Programming Project 2 Business class extends Building
 *Uses Building class to create a type of building, a business building\
 *uses the super method to use variables from the Building class
 */

public class Business extends Building{

	protected int numRentableUnits;
	
	public Business() {
		super();
		numRentableUnits = 0;
	}//empty argument constructor
	
	public Business (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}//preferred constructor
	
	//getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	//end getters and setters
	
	public String displayData() {
		String display = "Project Name: " + projectName + " Full Address: " + completeAddress+ " SquareFeet: " + totalSquareFeet + " Occupancy group: " + occupancyGroup + " Subgroup: " + subgroup + " Number of Rentable Units: " + numRentableUnits;  
		return display;
	}//displays specific data about a business. 
	
} 
