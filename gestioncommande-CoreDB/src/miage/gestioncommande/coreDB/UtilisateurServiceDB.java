package miage.gestioncommande.coreDB;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Responsable;
import miage.gestioncommande.api.UtilisateurService;

@Singleton
@Local(UtilisateurService.class)
public class UtilisateurServiceDB implements UtilisateurService{

	@PersistenceContext(unitName="gestioncabinet")
	private EntityManager em;

	private List<Client> listeClient;
	private List<Responsable> listeResponsable;
	
	@PostConstruct
	public void initialiser() {
		
		listeClient = new ArrayList<Client>();
		listeResponsable = new ArrayList<Responsable>();
	}

	public List listerClients() {
		Query q = em.createNamedQuery("getAllClient");
		return q.getResultList();
	}

	public List listerResponsable() {
		Query q = em.createNamedQuery("getAllResponsable");
		return q.getResultList();
	}

	public void creerClient(Client c) {
		em.persist(c);		
		
	}

	public void creerResponsable(Responsable r) {
		em.persist(r);		
		
	}
	
}