package miage.gestioncommande.coreDB;

import java.util.ArrayList;
import java.util.List;

import miage.gestioncommande.api.CatalogueService;
import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.CommandeService;
import miage.gestioncommande.api.Produit;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Local(CommandeService.class)
public class CommandeServiceDB implements CommandeService{

	@PersistenceContext(unitName="gestioncabinet")
	private EntityManager em;
	
	private List<Commande> listeCommande;
	private Commande commandeSelectionner;
	
	@PostConstruct
	public void initialiser() {
		listeCommande = new ArrayList<Commande>();

	}
	
	public List rechercherCommande() {
		Query q = em.createNamedQuery("getAllCommande");
		return q.getResultList();
	}

	public void livrerCommande(Commande c) {
		// TODO Auto-generated method stub
		
	}

	public Commande creerCommande(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectionnerCommande(Commande c) {
		// TODO Auto-generated method stub
		
	}

	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	public void supprimerProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	public void sauvegarderCommande() {
		// TODO Auto-generated method stub
		
	}

	public List listerProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	public List listerCommandes(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
