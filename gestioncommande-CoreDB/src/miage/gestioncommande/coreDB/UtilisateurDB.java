package miage.gestioncommande.coreDB;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import miage.gestioncommande.api.Utilisateur;
@Entity
@Table(name="t_utilisateur")
public abstract class UtilisateurDB implements Utilisateur {

	@Id
	@Column(name="c_id")
	private Long id;
	
	@Column(name="c_nom")
	private String nom;
	
	@Column(name="c_prenom")
	private String prenom;
	
	@Column(name="c_login")
	private String login;
	
	@Column(name="c_mdp")
	private String mdp;

	@Embedded
	private AdresseDB adresse;
	
	@Embedded
	private ClientDB client;
	
	@Embedded
	private ResponsableDB responsable;
	
	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#getNom()
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#getPrenom()
	 */
	@Override
	public String getPrenom() {
		return prenom;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#setPrenom(java.lang.String)
	 */
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#getLogin()
	 */
	@Override
	public String getLogin() {
		return login;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#setLogin(java.lang.String)
	 */
	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#getMdp()
	 */
	@Override
	public String getMdp() {
		return mdp;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Utilisateur#setMdp(java.lang.String)
	 */
	@Override
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
}
