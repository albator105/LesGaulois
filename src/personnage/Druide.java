package personnage;

import objets.Chaudron;
import test_fonctionnel.TestGaulois;

public class Druide {
	private String name;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String name, int force) {
		super();
		this.name = name;
		this.force = force;
	}

	public String getName() {
		return name;
	}

	private String prendreParole() {
		return "Le druide " + this.name + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concoté " + quantite + " doses de potion magique. Elle as une force de " + forcePotion);

	}

	public void booste(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if (gaulois.getNom() == "Obélix") {
				this.parler("Non " + gaulois.getNom() + ", et tu le sais tres bien");
			} else {
				gaulois.boirePotion(chaudron.prendreLouche());
				this.parler("Tien, " + gaulois.getNom() + " prends un peu de potion magique");

			}

		} else {
			this.parler("Désolé " + gaulois.getNom() + ", il ne reste plus une seule goutte de potion magique");
		}

	}

}
