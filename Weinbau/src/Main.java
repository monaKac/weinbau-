
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datenbank initialisieren 
		Datenbank.initialisiereWinzer(); 
		Datenbank.initialisiereWetter();
		//GUI initialisieren
		GUI.initialisiere(Datenbank.getWinzer());
		
		Feldarbeiter feldarbeiterAnwendung = new Feldarbeiter(Datenbank.getWinzer()); 
	}

}
