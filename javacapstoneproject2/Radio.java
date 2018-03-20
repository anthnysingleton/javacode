// a FM radio receiver
public class Radio {
	private int rId; //radio ID number
	private Location r;
	//Constructs Radio object
	public Radio(int radioId, double longitude , double latitude ){
		Location n = new Location(longitude , latitude);
		r=n;
		rId = radioId;
	}
	// prints the radio Id of object
	public int getradioID(){
		return rId;
	}
	//gets location of radio
	public Location getradioLoc(){
		return this.r;
	}
	//set location of radio to desired long. and lat.
	public Location setradioLoc(double x, double y){
		return this.r = new Location (x , y);
	}
	// allows formated print
	public String toString(){
		return "Radio: " + rId + " Located " + getradioLoc();
	}
}


