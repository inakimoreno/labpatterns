package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Observable pacient1 = new Covid19Pacient("aitor", 35);
		//Observable pacient2 = new Covid19Pacient("ainara", 28);
		//Observable pacient3 = new Covid19Pacient("ane", 19);
		PacientObserverGUI pacientGUI1 = new PacientObserverGUI(pacient1);
		//PacientObserverGUI pacientGUI2 = new PacientObserverGUI(pacient2);
		//PacientObserverGUI pacientGUI3 = new PacientObserverGUI(pacient3);
		PacientSymptomGUI frame1 = new PacientSymptomGUI((Covid19Pacient) pacient1);
		//PacientSymptomGUI frame2 = new PacientSymptomGUI((Covid19Pacient) pacient2);
		//PacientSymptomGUI frame3 = new PacientSymptomGUI((Covid19Pacient) pacient3);
		PacientThermometerGUI term1 = new PacientThermometerGUI(pacient1);
		//PacientThermometerGUI term2 = new PacientThermometerGUI(pacient2);
		//PacientThermometerGUI term3 = new PacientThermometerGUI(pacient3);
		SemaphorGUI sem = new SemaphorGUI(pacient1);
	}
}
