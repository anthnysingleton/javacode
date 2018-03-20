// Second Driver Test for project 
public class RadioTowerControllerDriverTest1 {

public static void main(String[] args) {
		
		DriverLocation();
		System.out.println();
		DriverRadio();
		System.out.println();
		DriverRadioTower();
		System.out.println();
		DriverRadioTowerController();
	}
	public static void DriverLocation(){
		
		Location boston = new Location(42.3583 , 71.0603);
		Location newYork = new Location(40.7142 , 74.0064);
		System.out.println("Boston's Longitude:                " + boston.getlongitude());
		System.out.println("Boston's Latitude:                " + boston.getlatitude());
		System.out.println("Distance from Boston to New York:                " + boston.getDistance(newYork));
	}
	
	public static void DriverRadio(){
		
		Radio bostonRadio = new Radio(00001,42.3583 , 71.0603);
		System.out.println("Boston radio ID" +" "+ bostonRadio.getradioID());
		System.out.println("Boston radio Location" + bostonRadio.getradioLoc());
		System.out.println("Boston radio set new location" + bostonRadio.setradioLoc(90.67, 65.55));
		
	}
	
	public static void DriverRadioTower(){
		
		RadioTower rt1 = new RadioTower(42.33, 71.00);
		Radio bostonRadio = new Radio(00001,42.3583 , 71.0603);
		Radio newYorkRadio = new Radio(00002,40.7142 , 74.0064);
		Radio caliRadio = new Radio (0003, 40.00 , 65.00);
		System.out.println();
		System.out.println("Boston radio ID" +" "+ bostonRadio.getradioID());
		System.out.println("Boston radio Location" + bostonRadio.getradioLoc());
		System.out.println("Radio Tower"+" "+ rt1 +" "+ rt1.covers(bostonRadio));
		System.out.println();
		System.out.println("New York radio ID" +" "+ newYorkRadio.getradioID());
		System.out.println("New York radio Location" + newYorkRadio.getradioLoc());
		System.out.println("Radio Tower"+" "+ rt1 +" "+ rt1.covers(newYorkRadio));
		System.out.println();
		System.out.println("Cali radio ID" +" "+ caliRadio.getradioID());
		System.out.println("Cali radio Location" + caliRadio.getradioLoc());
		System.out.println("Radio Tower"+" "+ rt1 +" "+ rt1.covers(caliRadio));
	    
	}
	
	public static void DriverRadioTowerController(){
		
		RadioTower rt1 = new RadioTower(42.33,71.00);
		RadioTower rt2 = new RadioTower(77.42,99.00);
		RadioTower rt3 = new RadioTower(80.22,33.45);
		Radio boston = new Radio(00001,42.3583 , -71.0603);
		RadioTowerController masterTowerlist = new RadioTowerController();
		masterTowerlist.addRadioTower(rt1);
		masterTowerlist.addRadioTower(rt2);
		masterTowerlist.addRadioTower(rt3);
		masterTowerlist.removeRadioTower(rt3);
		masterTowerlist.findTowerforRadio(boston);
		
	}

}
