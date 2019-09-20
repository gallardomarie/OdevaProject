package odeva.odeva;

public class Voiture {

	String marque;
	int annee;
	int km;
	
	public Voiture(String marque, int annee){
		this.marque = marque;
		this.annee = annee;
		this.km =0;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getKilometre() {
		return km;
	}
	public void setKilometre(int km) {
		this.km = km;
	}
	
	public void roule(int km){
		this.km += km;
	}
}
