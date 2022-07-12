package Fahrzeuge;

public class Scooter extends Roller {

	private int anzahlScooter;
	private int gewicht;
	private boolean klappbar;

	Scooter() {
	}

	public Scooter(int anzahlScooter, int gewicht, boolean klappbar) {
		super();
		this.anzahlScooter = anzahlScooter;
		this.gewicht = gewicht;
		this.klappbar = klappbar;
	}

	public int getAnzahlScooter() {
		return anzahlScooter;
	}

	public void setAnzahlScooter(int anzahlScooter) {
		this.anzahlScooter = anzahlScooter;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public boolean isKlappbar() {
		return klappbar;
	}

	public void setKlappbar(boolean klappbar) {
		this.klappbar = klappbar;
	}

}
