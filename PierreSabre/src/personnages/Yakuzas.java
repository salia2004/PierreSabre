package personnages;

public class Yakuzas extends Humain
{
    private String clan;
    private int reputation=4 ;

    public Yakuzas(String nom,String boisson,int argent,String clan) {
		super(nom,boisson,argent);
		this.clan=clan;
		this.reputation=0;
	}
    public int getReputation() {
    	return reputation;
    }
    public void extorquer(Commercants victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
    	parler( victime +"si tu tiens à la vie donne moi ta bourse !");
    	int x = victime.seFaireExtorquer();
    	this.argent+=x;
    	this.reputation+=1;
    	parler("j’ai piqué les"+ x +"sous de "+ victime +"ce qui me fait"+ this.argent + "sous dans ma poche. Hi ! Hi !");
    }
    public int perdre() {
    	reputation-=1;
    	int somme=argent;
    	argent=0;
    	parler("J’ai perdu mon duel et mes "+ somme +" sous, snif... J'ai déshonoré le clan de "+ clan);
    	return somme;

    }
    public void direBonjour() {
		parler(this.nom +" : Bonjour ! Je m’appelle "+  this.nom  + " et j’aime boire du  "+ this.boissonFavorite);
		parler(this.nom + "Mon clan est celui de "+ this.clan );

	}
    public void gagner(int gain) {
    	reputation+=1;
    	argent+=gain;
    	parler("Ce ronin pensait vraiment battre "+ this.nom +"du clan"+ clan +"? Je l'ai dépouillé de ses " + gain +" sous.");

    }
}
