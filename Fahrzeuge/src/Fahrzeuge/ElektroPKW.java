package Fahrzeuge;

public class ElektroPKW extends PKW {
	private int anzahlElektroPKW;
	private int akkuKapazitaet;
	private int ladestand;

	ElektroPKW() {

	}

	public ElektroPKW(int anzahlElektroPKW, int akkuKapazitaet, int ladestand) {
		super();
		this.anzahlElektroPKW = anzahlElektroPKW;
		this.akkuKapazitaet = akkuKapazitaet;
		this.ladestand = ladestand;
	}

	public int getAnzahlElektroPKW() {
		return anzahlElektroPKW;
	}

	public void setAnzahlElektroPKW(int anzahlElektroPKW) {
		this.anzahlElektroPKW = anzahlElektroPKW;
	}

	public int getAkkuKapazitaet() {
		return akkuKapazitaet;
	}

	public void setAkkuKapazitaet(int akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}

	public int getLadestand() {
		return ladestand;
	}

	public void setLadestand(int ladestand) {
		this.ladestand = ladestand;
	}

}
