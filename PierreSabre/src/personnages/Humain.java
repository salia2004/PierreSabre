package personnages;

public class Humain {
	protected String nom;
	protected String boissonFavorite ;
	protected int argent;
	////constructeur

	public Humain( String nom , String boissonFavorite, int argent) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.argent=argent;}
	////gettteur et setteur

	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}

	////methodes spe

	public void boire() {
		parler("MMM, un bon verre de "+ this.boissonFavorite + " ! GLOUPS!!");
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+  this.nom  + " et j’aime boire du  "+ this.boissonFavorite);

	}

	public void acheter(String bien, int prix) {
		if (getArgent()>prix) {
			parler("J'ai"+ this.argent +" sous en poche. Je vais pouvoir m'o rir une"+ bien +" à "+ prix +" sous ");
		}
		else {
			parler("Je n'ai plus que "+ this.argent +" Je ne peux même pas m'o rir un "+ bien +"à "+ prix +" sous ");
		}}

	protected void parler(String texte){
		System.out.println(texte);
	}

	public void gagnerArgent(int gain){
		this.argent+=gain;

	}
	public void perdreArgent(int perte) {
		this.argent-=perte;

	}


}
