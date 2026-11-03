package village_gaulois;

import personnage.Gaulois;

public class Village {

	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[30];

	public Village(String nom, Gaulois chef) {
		super();
		this.nom = nom;
		this.chef = chef;
		this.chef.setVillage(this);

	}

	public String getNom() {
		return this.nom;
	}

	public Gaulois getChef() {
		return this.chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);

	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (villageois[numVillageois - 1] == null) {
			System.out.println("Il n'y as pas autant d'habitant dans notre village !");
			return null;
		} else
			return villageois[numVillageois - 1];

	}


	public void afficherVillage() {
		System.out.println("Dans le village \""+this.nom+"\" du chef "+this.chef.getNom()+" vivent les légendaires gaulois : ");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-"+this.villageois[i].getNom());
			
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix);
		village.trouverVillageois(10);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublepolemix = new Gaulois("Doublepolémix",4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
		
	}

}
