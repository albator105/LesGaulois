package personnage;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

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
		assert isForcecoupPositive(forcecoup);
		int forceInitiale = this.force;
		this.force = this.force - forcecoup;
		if (this.force < 1) {
			System.out.println(prendreParole() + "J'abandonne");
		} else {
			System.out.println(prendreParole() + "aie");
		}
		assert this.isInvariantVerified();
		assert isForceDecreased(forceInitiale);

	}
	private boolean isForcecoupPositive(int forcecoup) {return forcecoup >= 0;}
	private boolean isForceDecreased(int forceInitiale) {return forceInitiale >= this.force;}

	private boolean isInvariantVerified() {
		if (this.force >= 0) {
			return true;
		} else
			return false;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (this.nbEquipement){
		case 2: {
			
			System.out.println("le soldat "+this.getNom()+" est deja bien equipé");
			break;
		}
		case 1: {
			if (equipement.toString() == this.equipements[nbEquipement-1].toString()) {
				System.out.println("le soldat "+this.getNom()+" possède deja un "+equipement.toString());
				break;
			}
			else {
				this.equipements[nbEquipement] = equipement;
				nbEquipement++;
				System.out.println("Le soldat "+this.getNom()+" s'equipe avec un "+ equipement.toString());
				break;
			}
		}
		case 0: {
			this.equipements[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat "+this.getNom()+" s'equipe avec un "+equipement.toString());
			break;
		}}}
		
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	
	
	
	
	
	
}
