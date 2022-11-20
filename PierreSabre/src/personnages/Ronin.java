package personnages;

public class Ronin extends Humain {
	private int honneur=4;
	public Ronin(String nom,String boisson,int argent)
	{
		super(nom,boisson,argent);
	}

	public void donner(Commercants beneficiaire) {
		int don=(10*argent)/100;
		parler(beneficiaire.getNom() +" prend ces "+ don +" sous.");
		argent-=don;
		beneficiaire.recevoir(don);

	}
	public void provoquer(Yakuzas adversaire){
		int force=2*honneur;
		int rep=adversaire.getReputation();
		if (force>=rep) {
		    honneur+=1;
		    parler(this.getNom()+" - Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		    parler("- Je t’ai eu petit yakusa!");
		    int x=adversaire.perdre();
		    argent+=x;
			}
		else {
			honneur-=1;
			parler(this.getNom()+" - J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
			argent=0;
			}
		}

}
