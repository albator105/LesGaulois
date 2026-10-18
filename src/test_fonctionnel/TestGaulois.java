package test_fonctionnel;

import personnage.Druide;
import personnage.Gaulois;
import personnage.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix;
		Gaulois obelix;
		//Romain minus;
		//minus = new Romain("Minus", 6);
		asterix = new Gaulois("Asterix", 8);
		obelix = new Gaulois("Obélix", 16);
		
		//asterix.parler("Bonjour");
		//obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)");
		//asterix.parler("Oui très bonne idée.");
		//System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.toString() + " tombent nez à nez sur le romain " + minus.getNom());
		//while (minus.getForce() > 1) {
		//asterix.frapper(minus);}
		
		Romain brutus;
		brutus = new Romain("Brutus",14);
		Druide panoramix;
		panoramix = new Druide("Panoramix",2); 
		
		panoramix.fabriquerPotion(4, 3);
		panoramix.booste(obelix);
		panoramix.booste(asterix);
		int i =0;
		for (i=0;i<3;i++) {
			asterix.frapper(brutus);
		}
		
		
		
		
	}

}
