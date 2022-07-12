package Fahrzeuge;

public class PKW extends Fahrzeug {
	private String kfzKennzeichen;
	private int anzahlTueren;
	private int anzahlMaxInsassen;

	PKW() {
	}

	public PKW(String kfzKennzeichen, int anzahlTueren, int anzahlMaxInsassen) {
		super();
		this.kfzKennzeichen = kfzKennzeichen;
		this.anzahlTueren = anzahlTueren;
		this.anzahlMaxInsassen = anzahlMaxInsassen;
	}

	public String getKfzKennzeichen() {
		return kfzKennzeichen;
	}

	public void setKfzKennzeichen(String kfzKennzeichen) {
		this.kfzKennzeichen = kfzKennzeichen;
	}

	public int getAnzahlTueren() {
		return anzahlTueren;
	}

	public void setAnzahlTueren(int anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}

	public int getAnzahlMaxInsassen() {
		return anzahlMaxInsassen;
	}

	public void setAnzahlMaxInsassen(int anzahlMaxInsassen) {
		this.anzahlMaxInsassen = anzahlMaxInsassen;
	}

}
