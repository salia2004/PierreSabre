package personnages;

public class Humain {
	protected String nom;
	protected String boissonFavorite ;
	protected int argent;
	protected Humain[] connaissance= new Humain[30] ;
	protected int nbConnaissance=0;
	protected int nbmax=30;
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
		parler(this.nom +" : Bonjour ! Je m’appelle "+  this.nom  + " et j’aime boire du  "+ this.boissonFavorite);

	}

	public void acheter(String bien, int prix) {
		if (getArgent()>prix) {
			parler("J'ai"+ this.argent +" sous en poche. Je vais pouvoir m'o rir une"+ bien +" à "+ prix +" sous ");
		}
		else {
			parler("Je n'ai plus que "+ this.argent +" Je ne peux même pas m'o rir un "+ bien +"à "+ prix +" sous ");
		}}

	protected void parler(String texte){
		System.out.println(this.getNom()+texte);
	}

	public void gagnerArgent(int gain){
		this.argent+=gain;

	}
	public void perdreArgent(int perte) {
		this.argent-=perte;

	}
	protected void repondre(){
		direBonjour();
	}
	
	public void memoriser(Humain humain) {
		if (nbConnaissance<nbmax)
		{
			connaissance[nbConnaissance]=humain;
			nbConnaissance++;
			}
		else{
			for(int i=0;i<nbConnaissance-1;i++)
			{
				connaissance[i]=connaissance[i+1];
			}
			connaissance[29]=humain;
			}
		}
	public void listerConnaissance() {
		String c="";
		String p=",";
		for(int i=0;i<nbConnaissance;i++) {
			if (i!=nbConnaissance-1) {
				p=", ";
			}
			else 
			{
				p="";
			}
			c= c + connaissance[i].getNom() + p ; 
			}
		
		parler("je connais beaucoup de personne donc : "+ c );
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre();
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
	


}
