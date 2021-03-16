/*Maya Sorensen CS131-01 Project 2
 * Application Class "builds" each of the different types of buildings in a test and displays data about each of the following classes:
 * Building class, Business class, Mall class, Residential class, Apartment class, and Single family home class.
 * 
*/

public class Application {

	public static void main(String[] args) {
		
		//test for Building class
		Building Bellarmine = new Building("University", "2001 Newburg Rd.", 10, "Students", "Education");
		Bellarmine.draw();
		System.out.println(Bellarmine.displayData());
		
		//test for Business class
		Business Bookstore = new Business("Bellarmine bookstore", "2002 Newburg Rd.", 70, "Employees", "Education", 1);
		System.out.println(Bookstore.displayData());
		
		//test for Mall class
		Mall Oxmoore = new Mall("Oxmoore", "1234 Mall Dr.", 10000.00, "Customers", "Shopping");
		Oxmoore.setNumRentedUnits(20);
		Oxmoore.setNumRentableUnits(2);
		Oxmoore.setMedianUnitSize(60.00);
		Oxmoore.setNumParkingSpaces(800);
		System.out.println(Oxmoore.displayData());
		
		//test for Residential class
		Residential Highlands = new Residential("Area", "Louisville ", 0, "Residents", "People");
		Highlands.setNumBathroom(4);
		Highlands.setNumBedroom(7);
		Highlands.setLaundryRoom(true);
		System.out.println(Highlands.displayData());
		
		//test for Apartment class
		Apartments BardstownApts = new Apartments("Apartments", "1 Bardstown Rd.", 500, "Residents", "Students");
		BardstownApts.setAvgUnitSize(500);
		BardstownApts.setNumRentableUnits(2);
		BardstownApts.setParkingAvailable(false);
		BardstownApts.setNumBathroom(2);
		BardstownApts.setNumBedroom(2);
		BardstownApts.setLaundryRoom(false);
		System.out.println(BardstownApts.displayData());
		
		//test for SingleFamilyHome class
		SingleFamilyHome SheffHouse = new SingleFamilyHome("Home", "2207 Sheffiled Blvd.", 2000, "Residents", "Students");
		SheffHouse.setGarage(true);
		SheffHouse.setNumBathroom(2);
		SheffHouse.setNumBedroom(4);
		SheffHouse.setLaundryRoom(false);
		System.out.println(SheffHouse.displayData());
		
		
	}
}
