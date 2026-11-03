package personnage;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.isInvariantVerified();
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");

	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public int getForce() {
		return force;
	}

	public void recevoirCoup(int forcecoup) {
		assert forcecoup >= 0;
		int forceInitiale = this.force;
		this.force = this.force - forcecoup;
		if (this.force < 1) {
			System.out.println(prendreParole() + "J'abandonne");
		} else {
			System.out.println(prendreParole() + "aie");
		}
		assert this.isInvariantVerified();
		assert this.force <= forceInitiale;

	}

	private boolean isInvariantVerified() {
		if (this.force >= 0) {
			return true;
		} else
			return false;
	}
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	}
	
	
	
	
	
	
}
