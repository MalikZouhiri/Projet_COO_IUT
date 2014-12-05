import java.util.HashSet;

public class Cours {
	
	/**
	 * Le nom du cour
	 */
	private String chNom;
	/**
	 * Une collection d'étudiant
	 */
	private HashSet chCollectionEtudiant = new HashSet();
	/**
	 * Une instance de la classe Enseignant
	 */
	private Enseignant chEnseignant;
	
	/**
	 * Constructeur de la classe Cours
	 * @param parNom le nom du cours
	 * @param parEnseignant un objet enseignant
	 */
	public Cours(String parNom, Enseignant parEnseignant)
	{
		chNom=parNom;
		chEnseignant = parEnseignant;
	}
	/**
	 * Accesseur qui retourne le nom du cour
	 * @return le nom du cour
	 */
	public String getNom()
	{
		return chNom;
	}
	/**
	 * Accesseur qui retourne la collection d'étudiant.
	 * @return un hashtest qui correspond à la collection d'étudiant
	 */
	public HashSet getAllEtudiant()
	{
		return chCollectionEtudiant;
	}
	/**
	 * Accesseur qui retourne l'enseignant qui enseigne le cour
	 * @return un objet de la classe Enseignant
	 */
	public Enseignant getEnseignant()
	{
		return chEnseignant;
	}
	/**
	 * Modificateur qui modifie le nom du cour par un nouveau nom
	 * @param nouveauNom le nouveau nom du cour
	 */
	public void setNom(String nouveauNom)
	{
		chNom=nouveauNom;
	}
	/**
	 * Modificateur qui change l'enseignant par un nouvel enseignant
	 * @param nouvelEnseignant nouveau enseignant
	 */
	public void setEnseignant(Enseignant nouvelEnseignant)
	{
		chEnseignant=nouvelEnseignant;
	}
	/**
	 * Méthode qui permet de supprimer un étudiant à la collection d'étudiant.
	 * @param e un instance de la classe Etudiant.
	 */
	public void suppEtudiant(Etudiant e)
	{
		chCollectionEtudiant.remove(e);
	}
	/**
	 * Méthode qui permet d'ajouter un étudiant à la collection d'étudiant.
	 * @param e un objet de la classe Etudiant.
	 */
	public void ajoutEtudiant(Etudiant e)
	{
		chCollectionEtudiant.add(e);
	}
	/**
	 * Méthode d'affichage de la classe Cours
	 */
	public String toString()
	{
		String str="Cour: " + chNom + " enseigné par " + chEnseignant.getNom();
		str+="\nListe des étudiants: \n";

		str+=chCollectionEtudiant;
		return str;
	}

}
