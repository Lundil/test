import java.util.ArrayList;


public class BateauVoyageur extends Bateau {
	private double vitesseBatVoy;
	private String imageBatVoy;
	private ArrayList<Equipement> lesEquipements;
	
	public BateauVoyageur(String unId, String unNom, double uneLongueur,
			double uneLargeur, double uneVitesse, String uneImage, ArrayList<Equipement> uneCollEquip){
		super(unId,unNom,uneLongueur,uneLargeur);
		this.vitesseBatVoy=uneVitesse;
		this.imageBatVoy=uneImage;
		this.lesEquipements=uneCollEquip;
	}
	public String toString(){
		String chaine = null;
		String enter = System.getProperty("line.separator"); 
		chaine=this.toString();
		chaine+="Vitesse : "+ vitesseBatVoy + "noeuds" + enter;
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
