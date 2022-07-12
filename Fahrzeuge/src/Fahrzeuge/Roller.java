package Fahrzeuge;

public class Roller extends Fahrzeug {
	private String farbe;
	private int zuladungKG;

	Roller() {
	}

	Roller(String color, int gewicht) {
		super();
		setFarbe(color);
		setZuladungInKG(gewicht);
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String color) {
		farbe = color;
	}

	public int getZuladungInKG() {
		return zuladungKG;
	}

	public void setZuladungInKG(int gewicht) {
		zuladungKG = gewicht;
	}
}
