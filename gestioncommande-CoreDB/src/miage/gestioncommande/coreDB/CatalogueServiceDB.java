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
		em.persist(p);		
	}

	@Override
	public void actualiserPrix(Prix px, Produit pr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit rechercherProduit(Long id) {
		return em.find(ProduitDB.class,id);
	}

	@Override
	public void supprimerProduit(Long id) {
		Produit produit_rechercher = em.find(ProduitDB.class,id);
		if (produit_rechercher !=null)
			em.remove(produit_rechercher);
		
	}

	@Override
	public Prix recupererPrix(Produit p) {
		//a corriger faut dabord recuperer/charger le produit car on est en lazy mode
		return (Prix)p.getPrix();
	}

}
