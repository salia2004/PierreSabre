package personnages;

import java.util.Random;

public class Grandmere extends Humain {
	private int nbConnaissance=5;
	
	public Grandmere( String nom , int argent) {
		super(nom,"tissane",argent);
	}
	
	private  enum TypeHumain {
		humain("habitant"),Commercants("commercants"),Ronin("ronin"),Yakuzas("yakuzas"),Samourai("samourai");
		private String nom;
		private TypeHumain (String nom) {
			this.nom=nom;
			}
		@Override
		public String toString() {
			return  this.nom ;
		}
	}
	
	public  String humainHasard() {
		Random random = new Random();
	    int x = random.nextInt(nbConnaissance-0 +1) ; 
	    TypeHumain[] types = TypeHumain.values();
	    
	    return types[x].toString();
	}
	public void memoriser(Humain humain) {
		if (nbConnaissance<5)
		{
			connaissance[nbConnaissance]=humain;
			nbConnaissance++;
			}
		else{
			for(int i=0;i<nbConnaissance-1;i++)
			{
				connaissance[i]=connaissance[i+1];
			}
			connaissance[4]=humain;
			}
		}
	public void ragoter() 
	{
		String c=humainHasard();
		
		
	}

	

}
