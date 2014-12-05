import junit.framework.TestCase;



public class TestIUT extends TestCase{


	public static void main(String[] args) {
		
		//Ajout d'un institut
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoubley","10-12 Avenue de l'Europe",139254833);
		System.out.println(iut_velizy.toString());

		//Ajout de département à l'institut
		Departement d_info = new Departement("Informatique");
		Departement d_src = new Departement("SRC");
		Departement d_reseau = new Departement("Réseau & Telecommunication");
		
		iut_velizy.ajoutDepartement(d_info);
		iut_velizy.ajoutDepartement(d_src);
		iut_velizy.ajoutDepartement(d_reseau);
		
		System.out.println(d_info.toString());
		
		//Ajout d'Enseignant:
		Enseignant e1 = new Enseignant("Dufaud");
		Enseignant e2 = new Enseignant("Robba", true);
		Enseignant e3 = new Enseignant("Martel");
		
		//Ajout de professeur à un département
		d_info.ajoutEnseignant(e1);
		d_info.ajoutEnseignant(e2);
		d_info.ajoutEnseignant(e3);
	
		
		System.out.println(d_info.getchCollection() +"\n\n");
		
		d_info.suppEnseignant(e2);
		System.out.println(d_info.getchCollection());
		
		Etudiant et1 = new Etudiant("Malik",21201565);
		Etudiant et2 = new Etudiant("Ted",21201564);
		Etudiant et3 = new Etudiant("Ugo",21201545);
		Etudiant et4 = new Etudiant("Nordine",21201567);
		iut_velizy.ajoutEtudiant(et1);
		iut_velizy.ajoutEtudiant(et2);
		iut_velizy.ajoutEtudiant(et3);
		iut_velizy.ajoutEtudiant(et4);
		System.out.println(iut_velizy.accederInfoEtu(et1));
		
		Cours COO = new Cours("COO",e1);
		COO.ajoutEtudiant(et1);
		COO.ajoutEtudiant(et2);
		COO.ajoutEtudiant(et3);
		COO.ajoutEtudiant(et4);
		System.out.println(COO.toString());
	}
	


}
