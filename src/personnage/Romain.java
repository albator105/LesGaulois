package personnage;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		this.force = this.force - forcecoup;
		if (this.force < 1) {System.out.println(prendreParole() + "J'abandonne");}
		else {System.out.println(prendreParole() + "aie");}
		
		
		
	}
}
