
/**
 * 
 * @author nazza
 *
 */
public class Etudiant {
	/**
	 * Le nom de l'étudiant
	 */
	private String chNom;
	/**
	 * Le numero etudiant de l'étudiant
	 */
	private int chNum;
	
	/**
	 * Constructeur de la classe Etudiant
	 * @param parNom le nom de l'étudiant
	 * @param parNum le numero etudiant de l'étudiant
	 */
	public Etudiant(String parNom, int parNum)
	{
		chNom=parNom;
		chNum=parNum;
	}
	/**
	 * Accesseur qui retourne le nom de l'étudiant
	 * @return le nom de l'étudiant
	 */
	public String getNom()
	{
		return chNom;
	}
	/**
	 * Accesseur qui retourne le numéro étudiant de l'étudiant
	 * @return le numéro etudiant de l'étudiant
	 */
	public int getNum()
	{
		return chNum;
	}
	/**
	 * Modificateur qui remplace le nom de l'étudiant par un nouveau nom
	 * @param nouveauNom le nouveau nom de l'étudiant
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	/**
	 * Modificateur qui remplace le numéro étudiant par un nouveau
	 * @param nouveauNum le nouveau numéro étudiant
	 */
	public void setNum(int nouveauNum)
	{
		chNum=nouveauNum;
	}
	/**
	 * Méthode d'affichage de la classe Etudiant, elle affiche le nom et le numero étudiant de l'étudiant.
	 */
	public String toString()
	{
		return "Etudiant: " + chNom + "\nNum:" + chNum;
	}

}
