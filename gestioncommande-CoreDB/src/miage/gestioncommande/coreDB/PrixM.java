package miage.gestioncommande.coreDB;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;
@Entity
@Table(name="t_prix")
public class PrixM implements Prix {
	
	@Id
	@Column(name="c_id")
	private Long id;
	
	@Column(name="c_prix")
	private Double prix;

	@Column(name="c_date_prix")
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
