/*Maya Sorensen Programming Project 2 Mall class extends Business class
 * Uses business class and therefore building class to create a type of building/business, Mall. 
 * Uses the super method to use variables and methods from building and business classes 
 */

public class Mall extends Business{

	private int numRentedUnits, numParkingSpaces;
	private double medianUnitSize;
	
	public Mall() {
		super();
		numRentableUnits = 0;
		numParkingSpaces = 0;
		medianUnitSize = 0.0;
	}//empty argument constructor 
	
	public Mall(String projectedName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//preferred constructor 
	
	//getters and setters 
	public int getNumberRentedUnits() {
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize ) {
		this.medianUnitSize = medianUnitSize;
	}
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	//end getters and setters 
	
	public void draw() {
		System.out.println("Drawing code for : " + this.getClass().getSimpleName());
	}//draw method to explain what is being displayed
	
	public String displayData() {
		String display = "Project name: " + projectName + " Full addres:  " + completeAddress + " Square Feet: " + totalSquareFeet+ " Occupancy Group: " + occupancyGroup + " Occupancy Subgroup: " + subgroup + " Number of rented units: " + numRentedUnits + " Number of rentable units: " + numRentableUnits + " Parking available: " + numParkingSpaces + " Median Unit Size: " + medianUnitSize; 
		return display;
	}//displays information about the Mall 
	
}
