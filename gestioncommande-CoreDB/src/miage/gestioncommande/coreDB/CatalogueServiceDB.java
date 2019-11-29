package miage.gestioncommande.coreDB;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import miage.gestioncommande.api.CatalogueService;
import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;

public class CatalogueServiceDB implements CatalogueService{

	
	private List<Produit> listeProduit;

	
	@PostConstruct
	public void initialiser() {
		listeProduit = new ArrayList<Produit>();

	}
	
	
	@Override
	public List<? extends Produit> afficherCatalogue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualiserPrix(Prix px, Produit pr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit rechercherProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Prix recupererPrix(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

}
