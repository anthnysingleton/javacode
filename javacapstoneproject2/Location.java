// a geographical location by (longitude,latitude)
public class Location{
	private double longitude;
	private double latitude;
	private static double R = 3959;
	
	//constructs at origin (0,0)
	public Location(){
		longitude = 0;
		latitude = 0;
	}
	
	//constructs at designated longitude and latitude
	public Location(double x , double y){
		this.longitude = x;
		this.latitude = y;
	}
	
	//converts into desired view (X,Y)
	public String toString(){
		return "("+ longitude +","+ latitude + ")";
	}
	
	// get the longitude of point
	public double getlongitude(){
		return this.longitude;
	}
	
	// get the latitude of the point
	public double getlatitude(){
		return this.latitude;
	}
	
	public  double getDistance(Location loc){
		// We need these in radians

			double long1 = Math.toRadians(this.longitude);
			double lat1 = Math.toRadians(this.latitude);
			double long2 = Math.toRadians(loc.getlongitude());
			double lat2 = Math.toRadians(loc.getlatitude());
				
				// To make it easier later on, make each trig function a variable
				double cosLat2 = Math.cos(lat2);
				double sinLonChange = Math.sin(long2-long1);
				double cosLat1 = Math.cos(lat1);
				double sinLat2 = Math.sin(lat2);
				double sinLat1 = Math.sin(lat1);
				double cosLonChange = Math.cos(long2-long1);
				
				// To make it easier, break this formula into three parts
				double a = Math.pow((cosLat2*sinLonChange), 2);
				double b = Math.pow(((cosLat1*sinLat2)-(sinLat1*cosLat2*cosLonChange)), 2);
				double c = (sinLat1*sinLat2)+(cosLat1*cosLat2*cosLonChange);
				
				// Calculate spherical distance
				double spherDistance = Math.atan(Math.sqrt(a+b)/c);
				
				// Get final distance by multiplying by Earth's radius
				double getDistance = R * spherDistance;
				
				return getDistance;
	}

}
	
	

