package personnages;

public class Commercants extends Humain {

	public Commercants(String nom,int argent) {
		super(nom,"the",argent);
	}

	public int seFaireExtorquer(){
		int oldArgent=this.argent;
		this.argent=0;
		parler("J'ai tout perdu ! le monde est trop injuste...");
		return oldArgent;
	}

	public void recevoir(int gain) {
		this.argent+=gain;
		parler( gain+" sous! Je te remercie genereux donateur !");
	}

}