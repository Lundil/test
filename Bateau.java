
public class Bateau {
	private String idBat;
	private String nomBat; 
	private double longueurBat;
	private double largeurBat;
	public Bateau(String unId, String unNom, double uneLongueur, double uneLargeur){
		this.idBat = unId;
		this.nomBat = unNom;
		this.longueurBat = uneLongueur;
		this.largeurBat = uneLargeur;
	}
	public String toString(){
		String enter = System.getProperty("line.separator"); 
		String text = "Nom du bateau : " + nomBat + enter + " Longueur : " + longueurBat + "mètres" + enter + " Largeur : " + largeurBat + "mètres";
		return text;
	}
}
