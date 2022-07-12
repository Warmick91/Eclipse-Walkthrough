package Fahrzeuge;

import java.time.LocalDate;

public class Fahrzeug {
	private LocalDate kaufDatum;
	private String fahrzeugKennung;
	private double kaufpreis;
	private boolean verfuegbar;

	Fahrzeug() {
	}

	Fahrzeug(LocalDate date, String kennung, double kaufpreis, boolean verfugbar) {
		setKaufDatum(date);
		setFahrzeugkennung(kennung);
		setKaufpreis(kaufpreis);
		setVerfuegbar(verfugbar);
	}

	public LocalDate getKaufDatum() {
		return this.kaufDatum;
	}

	public void setKaufDatum(LocalDate date) {
		kaufDatum = date;
	}

	public String getFahrzeugKennung() {
		return fahrzeugKennung;
	}

	public void setFahrzeugkennung(String kennung) {
		fahrzeugKennung = kennung;
	}

	public double getKaufpreis() {
		return kaufpreis;
	}

	public void setKaufpreis(double kaufpreis) {
		this.kaufpreis = kaufpreis;
	}

	public boolean isVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(boolean verfuegbar) {
		this.verfuegbar = verfuegbar;
	}

}
