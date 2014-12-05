import java.util.HashSet;

public class Institut {
	
	/**
	 * Le nom de l'institut
	 */
	private String chNom;
	/**
	 * L'adresse de l'institut
	 */
	private String chAdresse;
	/**
	 * Le numéro de téléphone de l'institut.
	 */
	private int chTelephone;
	/**
	 * Collection d'étudiant
	 */
	private HashSet chCollectionEtudiant = new HashSet();
	/**
	 * Collection de département
	 */
	private HashSet chCollectionDepartement = new HashSet();
	
	/**
	 * Constructeur de la classe Institut
	 * @param parNom nom de l'institut
	 * @param parAdresse adresse de l'institut
	 * @param parTelephone téléphone de l'institut
	 */
	public Institut(String parNom, String parAdresse, int parTelephone)
	{
		chNom=parNom;
		chAdresse=parAdresse;
		chTelephone=parTelephone;
	}
	
	//GETTER ---------------------------------------
	/**
	 * Accesseur qui permet d'acceder au nom de l'institut
	 * @return le nom de l'institut
	 */
	public String getNom()
	{
			return chNom;
	}
	/**
	 * Accesseur qui permet d'acceder à l'adresse de l'institut
	 * @return l'adressee de l'institut
	 */
	public String getAdresse()
	{
		return chAdresse;
	}
	/**
	 * Accesseur qui permet d'acceder au téléphone de l'institut
	 * @return le téléphone de l'institut
	 */
	public int getTelephone()
	{
		return chTelephone;
	}
	/**
	 * HashMap contenant la liste des départements de l'Institut
	 * @return la liste des départements
	 */
	public HashSet getCollectionDepartement()
	{
		return chCollectionDepartement;
	}
	
	/**
	 * HashMap contenant la liste des étudiants de l'Institut
	 * @return la liste des étudiants
	 */
	public HashSet getCollectionEtudiant()
	{
		return chCollectionEtudiant;
	}
	//SETTER --------------------------------------
	/**
	 * Modificateur qui permet de changer le nom de l'institut par un nouveau nom
	 * @param nouveauNom le nouveau nom de l'institut
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	/**
	 * Modificateur: modifie l'adresse de l'institut par une nouvelle adresse
	 * @param nouvelleAdresse la nouvelle adresse de l'institut
	 */
	public void setAdresse(String nouvelleAdresse)
	{
		chAdresse=nouvelleAdresse;
	}
	/**
	 * Modificateur: modifie le téléphone de l'institut par un nouveau téléphone
	 * @param nouveauTel le nouveau téléphone de l'institut
	 */
	public void setNum(int nouveauTel)
	{
		chTelephone=nouveauTel;
	}
	
	
	//Methode d'affichage ---------------------------------
	/**
	 * Méthode d'affichage: affiche dans une console le nom, l'adresse et le téléphone de l'institut
	 * @return une chaine de caractère
	 */
	public String toString()
	{
		return "Nom: " + chNom + "\n" + "Adresse: " +chAdresse + "\n" + "Telephone: 0" +chTelephone + "\n";
	}
	
	//METHODE DE GESTION DE L'IUT --------------------------
	/**
	 * Affiche les informations concernant un département
	 * @param d objet de la classe Departement
	 * @return une chaine de caractère
	 */
	public String accederInfoDep(Departement d)
	{
		return d.toString();
	}
	/**
	 * Affiche les informations concernant un étudiant
	 * @param e objet de la classe Etudiant
	 * @return une chaine de caractère
	 */
	public String accederInfoEtu(Etudiant e)
	{
		return e.toString();
	}
	/**
	 * Ajoute un étudiant à l'Institut
	 * @param e objet de la classe Etudiant
	 */
	public void ajoutEtudiant(Etudiant e)
	{
		chCollectionEtudiant.add(e);
	}
	/**
	 * Ajoute un département à l'Institut
	 * @param d objet de la classe Departement
	 */
	public void ajoutDepartement(Departement d)
	{
		chCollectionDepartement.add(d);
	}
	/**
	 * Suppression d'un département
	 * @param d objet de la classe département
	 */
	public void suppDepartement(Departement d)
	{
		chCollectionDepartement.remove(d);
	}
	
	/**
	 * Suppression d'un étudiant
	 * @param e un objet de la classe Etudiant
	 */
	public void suppEtudiant(Etudiant e)
	{
		chCollectionEtudiant.remove(e);
	}
	
	
}
