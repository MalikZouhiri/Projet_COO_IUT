import java.util.HashMap;
import java.util.HashSet;


public class Departement {
	
	/**
	 * Le nom du département
	 */
	private String chNom;
	/**
	 * Collection d'enseignant.
	 */
	private HashSet chCollectionEnseignant = new HashSet();
	/**
	 * Constructeur de la classe Departement.
	 * @param parNom Le nom du département.
	 */
	public Departement(String parNom)
	{
		chNom=parNom;
	}
	
	//GETTER ET SETTER -----------------------------------
	/**
	 * Accesseur qui récupère le nom du département.
	 * @return chNom Le nom du département.
	 */
	public String getNom()
	{
		return chNom;
	}
	/**
	 * Accesseur qui retourne la collection d'enseignant.
	 * @return un hashset qui correspond à la collection d'enseignant.
	 */
	public HashSet getchCollection()
	{
		return chCollectionEnseignant;
	}
	/**
	 * Modificateur qui remplace le nom du département par un nouveau nom.
	 * @param nouveauNom String correspondant au nouveau nom du département.
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	
	//Methode d'affichage ------------------------------------
	/**
	 * 	Méthode d'affichage de la classe Departement.
	 */
	public String toString()
	{
		return "Nom: Département " + chNom;
	}
	
	//GESTION DU DEPARTEMENT ---------------------------------
	/**
	 * Méthode permettant d'ajouter un enseignant à la collection d'enseignant
	 * @param e un objet de la classe Enseignant
	 */
	public void ajoutEnseignant(Enseignant e) //throws Exception
	{
		chCollectionEnseignant.add(e);
	}
	/**
	 * Méthode permettant de supprimer un enseignant à la collection d'enseignant
	 * @param e un objet de la classe Enseignant
	 */
	public void suppEnseignant(Enseignant e)
	{
		chCollectionEnseignant.remove(e);
	}
	/**
	 * Méthode d'affichage permettant d'afficher les informations concernant un enseignant.
	 * @param e un objet de la classe Enseignant
	 * @return une chaine de caractère
	 */
	public String accederInfoEnseignant(Enseignant e)
	{
		return e.toString();
	}
	
	

}
