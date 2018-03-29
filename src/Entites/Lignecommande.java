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

public class Lignecommande {

   
    protected LignecommandePK lignecommandePK;
   
    private Integer quantite;
   
    private Produit produit;
   
    private Commande commande;

    public Lignecommande() {
    }

    public Lignecommande(LignecommandePK lignecommandePK) {
        this.lignecommandePK = lignecommandePK;
    }

    public Lignecommande(int produit, int commande) {
        this.lignecommandePK = new LignecommandePK(produit, commande);
    }

    public LignecommandePK getLignecommandePK() {
        return lignecommandePK;
    }

    public void setLignecommandePK(LignecommandePK lignecommandePK) {
        this.lignecommandePK = lignecommandePK;
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

    public void setProduit1(Produit produit1) {
        this.produit = produit1;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande1(Commande commande1) {
        this.commande = commande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lignecommandePK != null ? lignecommandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lignecommande)) {
            return false;
        }
        Lignecommande other = (Lignecommande) object;
        if ((this.lignecommandePK == null && other.lignecommandePK != null) || (this.lignecommandePK != null && !this.lignecommandePK.equals(other.lignecommandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Lignecommande[ lignecommandePK=" + lignecommandePK + " ]";
    }
    
}
