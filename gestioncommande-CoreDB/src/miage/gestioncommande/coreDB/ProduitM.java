package miage.gestioncommande.coreDB;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;

@Entity
@Table(name="t_produit")
public class ProduitM implements Produit {

	@Id
	@Column(name="c_id")
	private Long id;
	
	@Column(name="c_label")
	private String designation;
	
	@XmlElement(type=PrixM.class)
	@OneToMany(targetEntity=PrixM.class)
	@JoinColumn("c_produit")
	private List<Prix> prix;

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Produit#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Produit#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Produit#getDesignation()
	 */
	@Override
	public String getDesignation() {
		return designation;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Produit#setDesignation(java.lang.String)
	 */
	@Override
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public List<Prix> getPrix() {
		if(prix == null) prix = new ArrayList<>();
		return prix;
	}

	@Override
	public void setPrix(List<Prix> prix) {
		this.prix = prix;
		
	}
	
}
