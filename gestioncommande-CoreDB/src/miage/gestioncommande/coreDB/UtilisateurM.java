package miage.gestioncommande.coreDB;


import miage.gestioncommande.api.Utilisateur;

public abstract class UtilisateurM implements Utilisateur {

	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private String login;
	
	private String mdp;

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
