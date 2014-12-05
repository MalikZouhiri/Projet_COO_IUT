
/**
 * 
 * @author nazza
 *
 */
public class Etudiant {
	/**
	 * Le nom de l'�tudiant
	 */
	private String chNom;
	/**
	 * Le numero etudiant de l'�tudiant
	 */
	private int chNum;
	
	/**
	 * Constructeur de la classe Etudiant
	 * @param parNom le nom de l'�tudiant
	 * @param parNum le numero etudiant de l'�tudiant
	 */
	public Etudiant(String parNom, int parNum)
	{
		chNom=parNom;
		chNum=parNum;
	}
	/**
	 * Accesseur qui retourne le nom de l'�tudiant
	 * @return le nom de l'�tudiant
	 */
	public String getNom()
	{
		return chNom;
	}
	/**
	 * Accesseur qui retourne le num�ro �tudiant de l'�tudiant
	 * @return le num�ro etudiant de l'�tudiant
	 */
	public int getNum()
	{
		return chNum;
	}
	/**
	 * Modificateur qui remplace le nom de l'�tudiant par un nouveau nom
	 * @param nouveauNom le nouveau nom de l'�tudiant
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	/**
	 * Modificateur qui remplace le num�ro �tudiant par un nouveau
	 * @param nouveauNum le nouveau num�ro �tudiant
	 */
	public void setNum(int nouveauNum)
	{
		chNum=nouveauNum;
	}
	/**
	 * M�thode d'affichage de la classe Etudiant, elle affiche le nom et le numero �tudiant de l'�tudiant.
	 */
	public String toString()
	{
		return "Etudiant: " + chNom + "\nNum:" + chNum;
	}

}
