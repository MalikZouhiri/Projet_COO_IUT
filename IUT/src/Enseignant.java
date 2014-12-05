
public class Enseignant {
	
	/**
	 * Le nom de l'enseignant
	 */
	private String chNom;
	/**
	 * Booleen qui indique si l'enseignant est directeur ou non.
	 */
	private boolean estDirecteur;
	
	/**
	 * Constructeur de la classe Enseignant.
	 * @param parNom le nom de l'enseignant
	 */
	public Enseignant(String parNom)
	{
		chNom=parNom;
		estDirecteur=false;
	}
	/**
	 * Constructeur 2 de la classe Enseignant
	 * @param parNom le nom de l'enseignant
	 * @param parDirecteur booleen qui indique si l'enseignant est directeur de département
	 */
	public Enseignant(String parNom, boolean parDirecteur)
	{
		estDirecteur=parDirecteur;
		chNom=parNom;
	}
	/**
	 * Accesseur qui retourne le nom de l'enseignant
	 * @return le nom de l'enseignant
	 */
	public String getNom()
	{
		return chNom;
	}
	/**
	 * Accesseur qui retourne un booleen qui nous informe si l'enseignant est directeur
	 * @return un boolen informant si l'enseignant est directeur
	 */
	public boolean getEstDirecteur()
	{
		return estDirecteur;
	}
	/**
	 * Modificateur qui permet de rendre un enseignant directeur ou non
	 * @param nouveauDirecteur booleen qui indique si l'enseignant est directeur
	 */
	public void setEstDirecteur(boolean nouveauDirecteur)
	{
		estDirecteur=nouveauDirecteur;
	}
	/**
	 * Modificateur qui permet de modifier le nom de l'enseignant par un nouveau nom
	 * @param nouveauNom le nouveau nom de l'enseignant
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	
	
	//METHODE D'AFFICHAGE
	/**
	 * Méthode d'affichage de la classe Enseignant.
	 */
	public String toString()
	{
		String str= "Nom : " + chNom  ;
		if(estDirecteur)
		{
			str+=" - directeur(ice) de département";
		}
		return chNom;
	}

}
