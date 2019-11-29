package miage.gestioncommande.coreDB;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.LigneCommande;
import miage.gestioncommande.api.Produit;
@Entity
@Table(name="t_ligne_commande")
public class LigneCommandeDB implements LigneCommande {
	

	@EmbeddedId
	private LigneCommandeDBId ligneCommandeDBId;
	

	@ManyToOne
	@MapsId("idCommande")
	private CommandeDB commande;
	
	@ManyToOne
	@MapsId("idProduit")
	private ProduitDB produit;
	

	@Column(name="c_quantite")
	private int quantite;
	
	private double montant;
	
	
	
	public CommandeDB getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = (CommandeDB)commande;
	}

	public ProduitDB getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = (ProduitDB)produit;
	}




	
	@Override
	public int getQuantite() {
		return quantite;
	}

	@Override
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public double getMontant() {
		return montant;
	}

	@Override
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	


	
	
	
	
	
	
	
	

}
