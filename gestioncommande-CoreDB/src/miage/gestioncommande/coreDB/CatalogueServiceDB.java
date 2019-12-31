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
		// on verifie que ce id correspond a un produit
		Produit produit_rechercher = em.find(ProduitDB.class,id);
		
		// si il existe un produit avec cet id alors on merge avant de supprimer pour etre sur que le produit est géré
		if (produit_rechercher !=null) {
			Produit p_manager = this.em.merge(produit_rechercher);
			this.em.remove(p_manager);
		}
		
	}

	@Override
	public Prix recupererPrix(Produit p) {
		Produit p_manager = em.merge(p);
		return (Prix)p_manager.getPrix();
	}

}
