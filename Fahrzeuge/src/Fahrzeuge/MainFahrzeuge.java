package Fahrzeuge;

import java.time.LocalDate;

public class MainFahrzeuge {

	public static void main(String[] args) {
		double preis;

		Scooter meinErsterScooter = new Scooter();

		meinErsterScooter.setKaufpreis(300);
		meinErsterScooter.setKaufDatum(LocalDate.of(2019, 5, 24));

		preis = meinErsterScooter.getKaufpreis();

		System.out.println("€" + preis);
		System.out.println(meinErsterScooter.getKaufDatum());
	}
 
}
