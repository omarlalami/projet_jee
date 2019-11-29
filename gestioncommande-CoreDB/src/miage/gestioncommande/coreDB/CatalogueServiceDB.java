package miage.gestioncommande.coreDB;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import miage.gestioncommande.api.CatalogueService;
import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;


@Singleton
@Local(CatalogueService.class)
public class CatalogueServiceDB implements CatalogueService{

	
	@PersistenceContext(unitName="gestioncabinet")
	private EntityManager em;


	private List<Produit> listeProduit;
	
	@PostConstruct
	public void initialiser() {
		listeProduit = new ArrayList<Produit>();

	}
	
	
	@Override
	public List<? extends Produit> afficherCatalogue() {
		Query q = em.createNamedQuery("getAllProduit");
		return q.getResultList();
	}

	@Override
	public void ajouterProduit(Produit p) {
		em.merge(p);		
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
