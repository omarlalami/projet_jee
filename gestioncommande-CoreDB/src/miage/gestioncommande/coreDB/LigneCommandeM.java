package miage.gestioncommande.coreDB;


import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.LigneCommande;
import miage.gestioncommande.api.Produit;
@Entity
@Table(name="t_ligne_commande")
public class LigneCommandeM implements LigneCommande {
	
	private Produit produit;
	
	private Commande commande;
	
	@Column(name="c_quantite")
	private int quantite;
	
	private double montant;

	@Override
	public Produit getProduit() {
		return produit;
	}

	@Override
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public Commande getCommande() {
		return commande;
	}

	@Override
	public void setCommande(Commande commande) {
		this.commande = commande;
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
