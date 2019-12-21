package miage.gestioncommande.coreDB;


import miage.gestioncommande.api.Responsable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Embeddable
@NamedQuery(name="getAllResponsable",query="SELECT r FROM ResponsableDB r")
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
