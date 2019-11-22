package miage.gestioncommande.coreDB;


import miage.gestioncommande.api.Adresse;

public class AdresseM implements Adresse {

	private String ligne1;
	
	private String ligne2;
	
	private String ville;
	
	private String codePostal;

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#getLigne1()
	 */
	@Override
	public String getLigne1() {
		return ligne1;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#setLigne1(java.lang.String)
	 */
	@Override
	public void setLigne1(String ligne1) {
		this.ligne1 = ligne1;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#getLigne2()
	 */
	@Override
	public String getLigne2() {
		return ligne2;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#setLigne2(java.lang.String)
	 */
	@Override
	public void setLigne2(String ligne2) {
		this.ligne2 = ligne2;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#getVille()
	 */
	@Override
	public String getVille() {
		return ville;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#setVille(java.lang.String)
	 */
	@Override
	public void setVille(String ville) {
		this.ville = ville;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#getCodePostal()
	 */
	@Override
	public String getCodePostal() {
		return codePostal;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Adresse#setCodePostal(java.lang.String)
	 */
	@Override
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	
	
}
