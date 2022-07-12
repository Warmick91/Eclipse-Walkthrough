package Fahrzeuge;

public class Escooter extends Roller {
	private int anzahlEscooter;
	private String akkuType;
	private String kfzKennzeichen;
	private double akkuKapazitaet;

	Escooter() {
	}

	public Escooter(int anzahlEscooter, String akkuType, String kfzKennzeichen, double akkuKapazitaet) {
		super();
		this.anzahlEscooter = anzahlEscooter;
		this.akkuType = akkuType;
		this.kfzKennzeichen = kfzKennzeichen;
		this.akkuKapazitaet = akkuKapazitaet;
	}

	public int getAnzahlEscooter() {
		return anzahlEscooter;
	}

	public void setAnzahlEscooter(int anzahlEscooter) {
		this.anzahlEscooter = anzahlEscooter;
	}

	public String getAkkuType() {
		return akkuType;
	}

	public void setAkkuType(String akkuType) {
		this.akkuType = akkuType;
	}

	public String getKfzKennzeichen() {
		return kfzKennzeichen;
	}

	public void setKfzKennzeichen(String kfzKennzeichen) {
		this.kfzKennzeichen = kfzKennzeichen;
	}

	public double getAkkuKapazitaet() {
		return akkuKapazitaet;
	}

	public void setAkkuKapazitaet(double akkuKapazitaet) {
		this.akkuKapazitaet = akkuKapazitaet;
	}

}
