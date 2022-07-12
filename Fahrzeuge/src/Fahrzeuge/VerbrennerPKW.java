package Fahrzeuge;

public class VerbrennerPKW extends PKW {
	private int anzahlVerbrennerPKW;
	private String treibstoff;
	private int fuellstand;

	VerbrennerPKW() {

	}

	public VerbrennerPKW(int anzahlVerbrennerPKW, String treibstoff, int fuellstand) {
		super();
		this.anzahlVerbrennerPKW = anzahlVerbrennerPKW;
		this.treibstoff = treibstoff;
		this.fuellstand = fuellstand;
	}

	public int getAnzahlVerbrennerPKW() {
		return anzahlVerbrennerPKW;
	}

	public void setAnzahlVerbrennerPKW(int anzahlVerbrennerPKW) {
		this.anzahlVerbrennerPKW = anzahlVerbrennerPKW;
	}

	public String getTreibstoff() {
		return treibstoff;
	}

	public void setTreibstoff(String treibstoff) {
		this.treibstoff = treibstoff;
	}

	public int getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(int fuellstand) {
		this.fuellstand = fuellstand;
	}

}
