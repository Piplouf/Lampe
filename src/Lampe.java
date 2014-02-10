
/**
 * Classe lampe
 * @author maruejof
 *
 */
public class Lampe {
	
	
	/**
	 * Puissance de la lampe
	 */
	private int puissance;
	/**
	 * Bool�en pour savoir si la lampe est allum�e
	 */
	private boolean estAllumee;
	
	/**
	 * Puissance par d�faut
	 */
	private final static int PUISSANCE_DEFAUT = 50;
	
	private String couleur;

	
	/**
	 * Constructeur de base
	 * Puissance = 50
	 * estAllumee = true
	 */
	public Lampe(){
		this(Lampe.PUISSANCE_DEFAUT);
	}
	
	/**
	 * Constructeur demandant la puissance
	 * @param puissance
	 */
	public Lampe(int puissance){
		
		this.puissance = puissance;
		this.estAllumee = true;
		this.couleur = "Blanc";
	}
	
	/**
	 * 
	 * @return puissance
	 */
	public int getPuissance() {
		return this.puissance;
	}
	
	
	/**
	 * 
	 * @return estAllumee
	 */
	public boolean isEstAllumee() {
		return this.estAllumee;
	}
	
	/**
	 * M�thode permettant d'allumer une lampe
	 */
	public void allumer(){
		this.estAllumee= true;
	}
	
	/**
	 * M�thode permettant d'�tinedre une lampe
	 */
	public void eteindre(){
		this.estAllumee= false;
	}
	
	public void changerCouleur(String couleur){
		this.couleur = couleur;
	}

	public String getCouleur() {
		return this.couleur;
	}
	
}
