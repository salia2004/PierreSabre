package personnages;

public class Samourai  extends Ronin {
	protected String seigneur;
	
	public Samourai(String nom,String boisson,int argent,String seigneur) {
		super(nom,boisson,argent);
		this.seigneur=seigneur;
		}
	@Override
	public void direBonjour() {
		parler(this.nom +" : Bonjour ! Je m’appelle "+  this.nom  + " et j’aime boire du  "+ this.boissonFavorite);
		parler(this.nom+ " : Je suis fier de servir le seigneur "+ this.seigneur);
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}

}
