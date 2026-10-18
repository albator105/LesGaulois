package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;

	public boolean resterPotion() {
		return this.quantitePotion > 0;
	}

	public int prendreLouche() {
		this.quantitePotion = this.forcePotion - 1;
		if (resterPotion()) {
			return forcePotion;
		} else {
			int force = forcePotion;
			this.forcePotion = 0;
			return force;
		}
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;

	}

}
