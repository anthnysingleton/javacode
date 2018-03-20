//A radio tower. we will assume that radio Towers have a range of exactly 150 miles
public class RadioTower {
	// Only attribute of Radio Tower and Identifier will be its location.
	private Location rtloc;

	// Will construct the Radio Tower at origin (0,0)
	public RadioTower(){
		this.rtloc = new Location();
	}
	
	// Will construct Radio tower at location provided by Driver
	public RadioTower(double x, double y){
		this.rtloc = new Location(x , y);
	}
	
	//Will Test and see if Tower is in range of radio
	public boolean covers(Radio r){
		Location rLocation =  r.getradioLoc();
		double distance = this.rtloc.getDistance(rLocation);
		//System.out.println(distance);
		if (distance <= 150){
		return true;
		}else {
			return false;
		}
	}
	
	// ToString method which will allow print statements
	public String toString(){
		return rtloc + " cover this radio?";
	}
}
 