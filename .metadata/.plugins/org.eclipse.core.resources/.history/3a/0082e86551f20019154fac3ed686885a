package miage.gestioncommande.coreM;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Singleton;

import miage.gestioncommande.api.CatalogueService;
import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;

@Singleton
@Local(CatalogueService.class)
public class CatalogueServiceM implements CatalogueService {

	private List<Produit> listeProduit;
	
	@PostConstruct
	public void initialiser() {
		listeProduit = new ArrayList<Produit>();
		
		Prix prix1 = new PrixM();
		prix1.setId((long) 1);
		prix1.setPrix(12.99);
		
		List<Prix> listePrix = new ArrayList<Prix>();
		listePrix.add(prix1);
		
		Produit produit1 = new ProduitM();
		produit1.setDesignation("gateau");
		produit1.setId((long) 1);
		produit1.setPrix(listePrix);
		
		listeProduit.add(produit1);
	}
	
	@Override
	public List<? extends Produit> afficherCatalogue() {
		return listeProduit;
	}

	@Override
	public void ajouterProduit(Produit p) {
		listeProduit.add(p);
	}

	@Override
	public void actualiserPrix(Prix px, Produit pr) {
		Long id_produit = pr.getId();
		Produit p_rechercher = rechercherProduit(id_produit);
		if (p_rechercher !=null) {
			List<Prix> prix = new ArrayList <Prix>();
			prix.add(px);
			p_rechercher.setPrix(prix);
		}
	}

	@Override
	public Produit rechercherProduit(Long id) {
		for(Produit p : listeProduit)
			if(p.getId().equals(id))
				return p;
		return null;
	}

	@Override
	public void supprimerProduit(Long id) {
		Produit p_rechercher = rechercherProduit(id);
		if (p_rechercher !=null)
			listeProduit.remove(p_rechercher);
	}

	@Override
	public Prix recupererPrix(Produit p) {
		Long id_produit = p.getId();
		Produit p_rechercher = rechercherProduit(id_produit);
		if (p_rechercher !=null)
			return (Prix)p_rechercher.getPrix();
		else
			return null;
	}

}
