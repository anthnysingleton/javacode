//Drvier Test class for the project
public class RadioTowerControllerDriver{

	public static void main(String[] args) {
//Ten radios created
		Radio bedfordMARadio = new Radio(1, 71.28 , 42.47);
		Radio worcesterMARadio = new Radio(2, 71.87 , 42.27);
		Radio apalachiolaFLRadio = new Radio(3, 82.03 , 28.73);
		Radio whitingFldFLRadio = new Radio(4, 83.02 , 29.00);
		Radio alamedaNasCARadio = new Radio(5, 120.32 , 37.00);
		Radio VisaliaCARadio = new Radio(6, 119.40 , 36.22);
		Radio abileneTXRadio = new Radio(7, 98.00 , 32.00);
		Radio winkTXRadio = new Radio(8, 99.10 , 31.48);
		Radio bigPineyWYRadio = new Radio(9, 107.10 , 42.57);
		Radio yellowstoneWYRadio = new Radio(10, 108.42 , 43.55);		
//five radioTowers 
		RadioTower florida = new RadioTower(81.7170,27.8333);
		RadioTower massachusetts = new RadioTower(71.5314, 42.2373);
		RadioTower california = new RadioTower(119.7462,36.1700);
		RadioTower texas = new RadioTower(97.6475, 31.1060);
		RadioTower wyoming = new RadioTower(107.2085,42.7475);		
//create towerlist
		RadioTowerController masterTowerlist = new RadioTowerController();
		masterTowerlist.addRadioTower(florida);
		masterTowerlist.addRadioTower(massachusetts);
		masterTowerlist.addRadioTower(california);
		masterTowerlist.addRadioTower(texas);
		masterTowerlist.addRadioTower(wyoming);		
//finds radio tower for each radio
		masterTowerlist.findTowerforRadio(bedfordMARadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(worcesterMARadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(apalachiolaFLRadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(whitingFldFLRadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(alamedaNasCARadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(VisaliaCARadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(abileneTXRadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(winkTXRadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(bigPineyWYRadio);
		System.out.println();
		masterTowerlist.findTowerforRadio(yellowstoneWYRadio);
	}
}
