/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;



/**
 *
 * @author User
 */

public class Historiquecommande{

  
    protected HistoriquecommandePK historiquecommandePK;
   
    private Integer quantite;
   
    private Produit produit;
   
    private Commande commande;

    public Historiquecommande() {
    }

    public Historiquecommande(HistoriquecommandePK historiquecommandePK) {
        this.historiquecommandePK = historiquecommandePK;
    }

    public Historiquecommande(int produit, int commande) {
        this.historiquecommandePK = new HistoriquecommandePK(produit, commande);
    }

    public HistoriquecommandePK getHistoriquecommandePK() {
        return historiquecommandePK;
    }

    public void setHistoriquecommandePK(HistoriquecommandePK historiquecommandePK) {
        this.historiquecommandePK = historiquecommandePK;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande1) {
        this.commande = commande1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historiquecommandePK != null ? historiquecommandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historiquecommande)) {
            return false;
        }
        Historiquecommande other = (Historiquecommande) object;
        if ((this.historiquecommandePK == null && other.historiquecommandePK != null) || (this.historiquecommandePK != null && !this.historiquecommandePK.equals(other.historiquecommandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Historiquecommande[ historiquecommandePK=" + historiquecommandePK + " ]";
    }
    
}
