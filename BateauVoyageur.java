import java.util.ArrayList;


public class BateauVoyageur /*extends Bateau*/ {
	private double vitesseBatVoy;
	private String imageBatVoy;
	private ArrayList<Equipement> lesEquipements;
	
	public BateauVoyageur(String unld, String unNom, double uneLongueur,
			double uneLargeur, double uneVitesse, String uneImage, ArrayList<Equipement> uneCollEquip){
		//super(nomBat,longueurBat,largeurBat);
		this.vitesseBatVoy=uneVitesse;
		this.imageBatVoy=uneImage;
		this.lesEquipements=uneCollEquip;
	}
	public String toString(){
		String chaine = null;
		String enter = System.getProperty("line.separator"); 
		/*chaine="Nom du bateau : "+ nomBat + enter;
		chaine+="Longueur : " + longueurBat + enter;
		chaine+="Largeur : " + largeurBat + enter;*/
		chaine+="Vitesse : "+ vitesseBatVoy + enter;
		chaine+="Liste des équipements du bateau : " + enter;
		for(Equipement unEquipement: lesEquipements){
			chaine+="- "+ unEquipement.toString() + enter;
		}
		return chaine;
	}
	public String getImageBatVoy(){
		String chaine = imageBatVoy;
		return chaine;
	}
}
