package personnages;
import java.util.Random;
public class Traitre extends Samourai{
	
	private int niveauTraitre=0 ;
	
	public Traitre(String nom,String boisson,int argent,String seigneur)
	{
		super(nom,boisson,argent,seigneur);
	}
	
	
	@Override
	public void direBonjour() {
		parler(this.nom +" : Bonjour ! Je m’appelle "+  this.nom  + " et j’aime boire du  "+ this.boissonFavorite);
		parler(this.nom+ " : Je suis fier de servir le seigneur "+ this.seigneur);
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+ niveauTraitre+". Chut !");
		}
	public void raconner(Commercants marco)
	{
		if (niveauTraitre<=3)
		{
			int argentraconner= (marco.getArgent()*2)/10;
			marco.perdreArgent(argentraconner);
			this.gagnerArgent(argentraconner);
			niveauTraitre++;
			parler(" : Si tu veux ma protection contre les Yakuzas , il va falloir payer ! /nDonne-moi "+ argentraconner + " sous ou gare a toi !");
			parler(" :Tout de suite grand " + this.getNom() + ".");
		}
		else
		{
		 parler(" :Mince je ne peux plus raconner personne sinon un samourai risque de me desmasquer !");
		}
		
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1)
		{
			parler(this.getNom()+" :Je ne peux faire ami ami avec personne car je ne connais personne ! Snif! .");
		}
		else
		{
			Random random = new Random();
		    int x = random.nextInt(nbConnaissance-0 +1) ; 
			int don=(argent*1)/20;
			parler(" :Il faut absolument remonter ma cote de confiance.Je vais faire ami ami avec " + connaissance[x].getNom()+ " .");
			parler(" :Bonjour l'ami !" +" Je voudrais vous aider en vous donnant "+ don +" sous.");
			connaissance[x].gagnerArgent(don);
			this.perdreArgent(don);
			connaissance[x].parler("Merci " + this.getNom()+" .Vous etes quelqu'un de bien> ");
			if (niveauTraitre>0)
			{
				niveauTraitre--;
			}
		}
		
	}
}
