package miage.gestioncommande.coreDB;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlElement;

import miage.gestioncommande.api.Adresse;
import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Responsable;

@Entity
@NamedQuery(name="getAllClient",query="SELECT c FROM ClientDB c")
public class ClientDB extends UtilisateurDB implements Client {

	@Column(name="c_genre")
	private String genre;
	
	@Column(name="c_datenaiss")
	private Calendar dateNaiss;
	
	@XmlElement(type=AdresseDB.class)
	private AdresseDB adresse;

	@XmlElement(type=ResponsableDB.class)
	private ResponsableDB responsable;

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
		this.adresse = (AdresseDB) adresse;
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
		this.responsable = (ResponsableDB) responsable;
	}
	
}
