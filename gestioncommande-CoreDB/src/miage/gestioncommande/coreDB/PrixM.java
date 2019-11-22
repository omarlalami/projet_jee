package miage.gestioncommande.coreDB;


import java.util.Calendar;

import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;

public class PrixM implements Prix {
	
	private Long id;
	
	private Double prix;
	
	private Calendar dateprix;
	

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Prix#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Prix#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Prix#getPrix()
	 */
	@Override
	public Double getPrix() {
		return prix;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Prix#setPrix(java.lang.Double)
	 */
	@Override
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Prix#getDateprix()
	 */
	@Override
	public Calendar getDateprix() {
		return dateprix;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Prix#setDateprix(java.util.Calendar)
	 */
	@Override
	public void setDateprix(Calendar dateprix) {
		this.dateprix = dateprix;
	}

}
