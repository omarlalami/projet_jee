package miage.gestioncommande.coreDB;


import java.util.Calendar;

import miage.gestioncommande.api.Adresse;
import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Responsable;

public class ClientDB extends UtilisateurDB implements Client {

	private String genre;
	
	private Calendar dateNaiss;
	
	private Adresse adresse;
	
	private Responsable responsable;

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#getGenre()
	 */
	@Override
	public String getGenre() {
		return genre;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#setGenre(java.lang.String)
	 */
	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#getDateNaiss()
	 */
	@Override
	public Calendar getDateNaiss() {
		return dateNaiss;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#setDateNaiss(java.util.Calendar)
	 */
	@Override
	public void setDateNaiss(Calendar dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#getAdresse()
	 */
	@Override
	public Adresse getAdresse() {
		return adresse;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#setAdresse(miage.gestioncommande.coreM.Adresse)
	 */
	@Override
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#getResponsable()
	 */
	@Override
	public Responsable getResponsable() {
		return responsable;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Client#setResponsable(miage.gestioncommande.coreM.Responsable)
	 */
	@Override
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
}
