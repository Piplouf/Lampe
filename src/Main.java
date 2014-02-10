
/**
 * Programme principal
 * @author maruejof
 *
 */
public class Main {

	/**
	 * Méthode principale.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Lampe maLampe = new Lampe(500);
		
		maLampe.eteindre();
		System.out.println(maLampe.isEstAllumee());
		System.out.println(maLampe.getPuissance());
		maLampe.allumer();
		System.out.println(maLampe.isEstAllumee());

	}

}
