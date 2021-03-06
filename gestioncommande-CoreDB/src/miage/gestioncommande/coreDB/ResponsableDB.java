package miage.gestioncommande.coreDB;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import miage.gestioncommande.api.Responsable;

@Entity
@NamedQuery(name="getAllResponsable",query="SELECT r FROM ResponsableDB r")
@DiscriminatorValue("responsable")
public class ResponsableDB extends UtilisateurDB implements Responsable{

	@Column(name="c_numemp")
	private String numEmployee;

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Responsable#getNumEmployee()
	 */
	@Override
	public String getNumEmployee() {
		return numEmployee;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Responsable#setNumEmployee(java.lang.String)
	 */
	@Override
	public void setNumEmployee(String numEmployee) {
		this.numEmployee = numEmployee;
	}
	
}
