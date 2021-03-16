/*Maya Sorensen Programming Project 2 Apartments class extends Residential 
 * Uses the residential class to create a type of building, Apartments
 * uses super method to use variables from residential 
 */

public class Apartments extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartments() {
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	}//empty argument constructor 
	
	public Apartments(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup){
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//preferred constructor 
	
	//getters and setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean getParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	//end getters and setters
	
	public void draw() {
		System.out.println("Drawing code for " + this.getClass().getSimpleName());
	}//explains what building the data will be displayed for
	
	public String displayData() {
		String display =  "Project Name: " + projectName + " Full Address: " + completeAddress+ " SquareFeet: " + totalSquareFeet + " Occupancy group: " + occupancyGroup + " Subgroup: " + subgroup + " Number of Bedrooms: " + numBedroom + " Number of Bathrooms: " + numBathroom + " Is there a Laundry Room: " + laundryRoom + " Number of rentable units " + numRentableUnits + " Average unit size: " + avgUnitSize + " Is there parking available: " + parkingAvailable;
		return display;
	}//displays data about the Apartment 
}

