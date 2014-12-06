import junit.framework.TestCase;


public class TestUnitaire extends TestCase{
	
	public void testAjoutDepartement()
	{
		
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		Departement d_info = new Departement("Informatique");
		iut_velizy.ajoutDepartement(d_info);
		assertTrue("Erreur: Departement non ajouté !", iut_velizy.getCollectionDepartement().contains(d_info) == true );	
	}
	
	public void testAjoutEnseignant()
	{
		Departement d_info = new Departement("Informatique");
		Enseignant e1 = new Enseignant("Dufaud");
		d_info.ajoutEnseignant(e1);
		assertTrue("Erreur: Enseignant non ajouté !", d_info.getchCollection().contains(e1) == true);
	}
	
	public void testAjoutEtudiant()
	{
		
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		Etudiant et1 = new Etudiant("Badara",25011548);
		iut_velizy.ajoutEtudiant(et1);
		assertTrue("Erreur: Etudiant non ajouté !", iut_velizy.getCollectionEtudiant().contains(et1) == true );	
	}
	
	public void testAjoutEtudiantAUnCour()
	{
		
		Etudiant et1 = new Etudiant("Charles",21011548);
		Enseignant e1 = new Enseignant("Dufaud");
		Cours COO = new Cours("COO",e1);
		COO.ajoutEtudiant(et1);
		assertTrue("Erreur: Etudiant non ajouté au cours !", COO.getAllEtudiant().contains(et1) == true );	
	}
	
	public void testAjoutEnseignantAUnCour()
	{
		
		Enseignant e1 = new Enseignant("Dufaud");
		Cours COO = new Cours("COO",e1);
		assertTrue("Erreur: Enseignant non ajouté au cours !", COO.getEnseignant().getNom() == e1.getNom() );	
	}

	public void testSuppEnseignant()
	{
		Departement d_info = new Departement("Informatique");
		Enseignant e1 = new Enseignant("Dufaud");
		d_info.ajoutEnseignant(e1);
		d_info.suppEnseignant(e1);
		assertTrue("Erreur: Enseignant non supprimé !", d_info.getchCollection().contains(e1) == false);
	}
	
	public void testSuppEtudiantInstitut()
	{
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		Etudiant et1 = new Etudiant("Badara",25011548);
		iut_velizy.ajoutEtudiant(et1);
		iut_velizy.suppEtudiant(et1);
		assertTrue("Erreur: Etudiant non supprimé !", iut_velizy.getCollectionEtudiant().contains(et1) == false);
	}
	
	public void testSuppDepartementInstitut()
	{
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		Departement d_info = new Departement("Informatique");
		iut_velizy.ajoutDepartement(d_info);
		iut_velizy.suppDepartement(d_info);
		assertTrue("Erreur: Etudiant non supprimé !", iut_velizy.getCollectionDepartement().contains(d_info) == false);
	}


	public void testSuppEtudiantAUnCours()
	{
		Etudiant et1 = new Etudiant("Charles",21011548);
		Enseignant e1 = new Enseignant("Dufaud");
		Cours COO = new Cours("COO",e1);
		COO.ajoutEtudiant(et1);
		COO.suppEtudiant(et1);
		assertTrue("Erreur: Etudiant non supprimé au cours!", COO.getAllEtudiant().contains(et1) == false);
	}
	
	public void testSetNomCours()
	{
		Enseignant e1 = new Enseignant("Dufaud");
		Cours COO = new Cours("COO",e1);
		COO.setNom("MPA");
		assertTrue("Erreur: Nom du cours non modifié !", COO.getNom() == "MPA");
	}
	
	public void testSetEnseignantCours()
	{
		Enseignant e1 = new Enseignant("Dufaud");
		Enseignant e2 = new Enseignant("Martel");
		Cours COO = new Cours("COO",e1);
		COO.setEnseignant(e2);
		assertTrue("Erreur: Enseignant du cours non modifié !", COO.getEnseignant() == e2);
	}
	
	public void testSetNomDepartement()
	{
		Departement d_info = new Departement("Informatique");
		d_info.setNom("SRC");
		assertTrue("Erreur: Nom departement non modifié !", d_info.getNom() == "SRC");
	}
	
	public void testSetNomEnseignant()
	{
		Enseignant e1 = new Enseignant("Dufaud");
		e1.setNom("Martel");
		assertTrue("Erreur: Nom Enseignant non modifié !", e1.getNom() == "Martel");
	}
	
	public void testSetEstDirecteurEnseignant()
	{
		Enseignant e1 = new Enseignant("Dufaud");
		e1.setEstDirecteur(true);
		assertTrue("Erreur: Enseignant non mis comme directeur !", e1.getEstDirecteur() == true);
	}
	
	public void testSetNomEtudiant()
	{
		Etudiant et1 = new Etudiant("Badara",25011548);
		et1.setNom("Ted");
		assertTrue("Erreur: Nom Etudiant non modifié !", et1.getNom() == "Ted");
	}

	public void testSetNumEtudiant()
	{
		Etudiant et1 = new Etudiant("Badara",25011548);
		et1.setNum(61245781);
		assertTrue("Erreur: Num Etudiant non modifié !", et1.getNum() == 61245781);
	}
	
	public void testSetNomInstitut()
	{
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		iut_velizy.setNom("IUT de Paris Descartes");
		assertTrue("Erreur: Nom Institut non modifié !", iut_velizy.getNom() == "IUT de Paris Descartes");
	}

	public void testSetNumInstitut()
	{
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		iut_velizy.setNum(12457845);
		assertTrue("Erreur: Num Institut non modifié !", iut_velizy.getTelephone() == 12457845);
	}	
	
	public void testSetAdresse()
	{
		Institut iut_velizy = new Institut("IUT de Vélizy-Villacoublay","10-12 Avenue de l'Europe",139254833);
		iut_velizy.setAdresse("143 Avenue de Versailles");
		assertTrue("Erreur: Adresse Institut non modifié !", iut_velizy.getAdresse() == "143 Avenue de Versailles");
	}	
	
}
