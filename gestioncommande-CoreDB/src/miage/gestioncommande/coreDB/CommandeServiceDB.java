package miage.gestioncommande.coreDB;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.CommandeService;
import miage.gestioncommande.api.Produit;


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

		Commande c_charger = em.merge(c);
		
		if (listeCommande.contains(c_charger)) {
			listeCommande.remove(c_charger);
			c_charger.setDateLivraison(Calendar.getInstance());
			listeCommande.add(c_charger);
		}		
	}

	public Commande creerCommande(Client c) {
		Commande com = new CommandeDB();
		com.setId((long) listeCommande.size());
		com.setDateCommande(Calendar.getInstance());
		com.setClient(c);		
		em.persist(com);
		return com;
	}

	public void selectionnerCommande(Commande c) {

		commandeSelectionner = em.merge(c);
		
	}

	public void ajouterProduit(Produit p) {

		ArrayList <LigneCommandeDB> ligneCommandes = (ArrayList<LigneCommandeDB>) commandeSelectionner.getLigneCommandes();

		
		Produit p_manager = em.merge(p);
		
		LigneCommandeDB lc = new LigneCommandeDB();
		lc.setCommande(commandeSelectionner);
		lc.setProduit(p);
		lc.setQuantite(1);
		lc.setMontant(p.getPrix().get(0).getPrix());
		
		ligneCommandes.add(lc);
		commandeSelectionner.setLigneCommandes(ligneCommandes);
		
		commandeSelectionner = em.merge(commandeSelectionner);

		
	}

	public void supprimerProduit(Produit p) {

		Produit p_manager = em.merge(p);

		commandeSelectionner = em.merge(commandeSelectionner);
		
		if (commandeSelectionner != null ){
			ArrayList <LigneCommandeDB> ligneCommandes = (ArrayList<LigneCommandeDB>) commandeSelectionner.getLigneCommandes();
			for( LigneCommandeDB ligneCommande : ligneCommandes){
				if ( (ligneCommande.getProduit()).equals(p_manager) )
				ligneCommandes.remove(ligneCommande);
			}
		}
		
		
	}

	public void sauvegarderCommande() {
		if (commandeSelectionner != null) {
			commandeSelectionner = em.merge(commandeSelectionner);
			listeCommande = em.merge(listeCommande);
			listeCommande.add(commandeSelectionner);
		}
	}

	public List listerProduit() {
		commandeSelectionner = em.merge(commandeSelectionner);

		
		ArrayList <LigneCommandeDB> ligneCommandes = (ArrayList<LigneCommandeDB>) commandeSelectionner.getLigneCommandes();
		ArrayList listeProduits = new ArrayList();
		for( LigneCommandeDB ligneCommande : ligneCommandes){
			listeProduits.add(ligneCommande.getProduit());
		}
		return listeProduits;
	
	
	}

	public List listerCommandes(Client c) {
		Client c_manager = em.merge(c);
		listeCommande = em.merge(listeCommande);
		
		ArrayList <Commande> commandesClient = new ArrayList();
		for ( Commande commande : listeCommande )
			if ( (commande.getClient()).equals(c) )
				commandesClient.add(commande);
		return commandesClient;
		
	}

}
