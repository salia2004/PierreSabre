package histoire;

import personnages.Commercants;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuzas;


public class HistoireTP4 {

	public static void main(String[] args) {
		Humain mamy=new Humain("mamy","orange",50);
		mamy.direBonjour();
		mamy.boire();
		mamy.acheter("kimono",20);
		mamy.acheter("voiture",500);
		mamy.acheter("orange", 10);
		mamy.boire();
		
		
		Commercants marco=new Commercants("Marco",50);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(50);
		marco.boire();
		
		Yakuzas ami=new Yakuzas("ami","coca",50,"jojo");
		ami.direBonjour();
		ami.extorquer(marco);
		
		Ronin dina=new Ronin("dina","tea",40);
		dina.direBonjour();
		dina.donner(marco);
		dina.provoquer(ami);
	}

}