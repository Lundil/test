
public class BateauFret extends Bateau{
	private double poidsmaxBatFret;
	public BateauFret(String unId, String unNom, double uneLongueur,
			double uneLargeur, double unPoids) {
		super(unId, unNom, uneLongueur, uneLargeur);
		this.poidsmaxBatFret=unPoids;
	}

}
