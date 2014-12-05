import java.util.HashMap;
import java.util.HashSet;


public class Departement {
	
	/**
	 * Le nom du d�partement
	 */
	private String chNom;
	/**
	 * Collection d'enseignant.
	 */
	private HashSet chCollectionEnseignant = new HashSet();
	/**
	 * Constructeur de la classe Departement.
	 * @param parNom Le nom du d�partement.
	 */
	public Departement(String parNom)
	{
		chNom=parNom;
	}
	
	//GETTER ET SETTER -----------------------------------
	/**
	 * Accesseur qui r�cup�re le nom du d�partement.
	 * @return chNom Le nom du d�partement.
	 */
	public String getNom()
	{
		return chNom;
	}
	/**
	 * Accesseur qui retourne la collection d'enseignant.
	 * @return un hashset qui correspond � la collection d'enseignant.
	 */
	public HashSet getchCollection()
	{
		return chCollectionEnseignant;
	}
	/**
	 * Modificateur qui remplace le nom du d�partement par un nouveau nom.
	 * @param nouveauNom String correspondant au nouveau nom du d�partement.
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	
	//Methode d'affichage ------------------------------------
	/**
	 * 	M�thode d'affichage de la classe Departement.
	 */
	public String toString()
	{
		return "Nom: D�partement " + chNom;
	}
	
	//GESTION DU DEPARTEMENT ---------------------------------
	/**
	 * M�thode permettant d'ajouter un enseignant � la collection d'enseignant
	 * @param e un objet de la classe Enseignant
	 */
	public void ajoutEnseignant(Enseignant e) //throws Exception
	{
		chCollectionEnseignant.add(e);
	}
	/**
	 * M�thode permettant de supprimer un enseignant � la collection d'enseignant
	 * @param e un objet de la classe Enseignant
	 */
	public void suppEnseignant(Enseignant e)
	{
		chCollectionEnseignant.remove(e);
	}
	/**
	 * M�thode d'affichage permettant d'afficher les informations concernant un enseignant.
	 * @param e un objet de la classe Enseignant
	 * @return une chaine de caract�re
	 */
	public String accederInfoEnseignant(Enseignant e)
	{
		return e.toString();
	}
	
	

}
