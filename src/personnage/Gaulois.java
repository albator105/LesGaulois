package personnage;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = (force * effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		if (effetPotion > 1) {
			effetPotion = effetPotion - 1;
		}

	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;

	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void sePresenter() {
		if (this.village==null) {
			System.out.println("Le Gaulois "+this.getNom()+" : \"Bonjour, je m'appelle "+this.getNom()+". Je voyage de villages en villages.\"");
		}
		else if (this.village.getChef().getNom()==this.getNom()) {
			System.out.println("Le Gaulois "+this.getNom()+" : \"Bonjour, je m'appelle "+this.getNom()+". Je suis le chef du village : "+this.village.getNom()+".\"");
		}
		else if (this.village!=null) {
			System.out.println("Le Gaulois "+this.getNom()+" : \"Bonjour, je m'appelle "+this.getNom()+". J'habite le village : "+this.village.getNom()+".\"");
		}
	}
		
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
