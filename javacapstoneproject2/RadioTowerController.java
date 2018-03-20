//Controls the radio Towers, polls them for locations, and so on
//For assignment we limit the number of radio towers controlled to 5
import java.util.*;

public class RadioTowerController {
	private ArrayList<RadioTower> Rtlist;
	//constructor
		public RadioTowerController(){ 
			 this.Rtlist = new ArrayList<RadioTower>();
		}
		
		//associates a radio tower to radioTowerController
		public boolean addRadioTower(RadioTower r){ 
			return this.Rtlist.add(r);
		
		}
		
		//disassociates a radioTower from radioTowerController
		public boolean removeRadioTower(RadioTower r){
			return this.Rtlist.remove(r);
	
		}
		
		// returns a RadioTwer object under which this radio is located
		public RadioTower findTowerforRadio(Radio r){
			r.getradioLoc();
			RadioTower foundTower = new RadioTower();
		
			//will loop through arraylist and apply each tower to its covers method
			for(int i= 0; i < Rtlist.size() ; i++){
				RadioTower rt1 = Rtlist.get(i);
				System.out.println(r.toString()+" "+" Does Tower"+" "+Rtlist.get(i)+" "+ rt1.covers(r));
			}
			return foundTower;
		}

}