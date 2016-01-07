
public class Bateau {
	private String idBat, nomBat; 
	private double longueurBat, largeurBat;
	public Bateau(String unId, String unNom, double uneLongueur, double uneLargeur){
		this.idBat = unId;
		this.nomBat = unNom;
		this.longueurBat = uneLongueur;
		this.largeurBat = uneLargeur;
	}
	public String toString(){
		String text = "Nom du bateau : " + nomBat + " Longueur : " + longueurBat + " Largeur : " + largeurBat;
		return text;
	}
}
