package miage.gestioncommande.coreDB;


import miage.gestioncommande.api.Responsable;

public class ResponsableDB extends UtilisateurDB implements Responsable{

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
