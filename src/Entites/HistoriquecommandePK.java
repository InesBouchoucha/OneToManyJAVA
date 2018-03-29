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

public class HistoriquecommandePK{

 
    private int produit;
 
    private int commande;

    public HistoriquecommandePK() {
    }

    public HistoriquecommandePK(int produit, int commande) {
        this.produit = produit;
        this.commande = commande;
    }

    public int getProduit() {
        return produit;
    }

    public void setProduit(int produit) {
        this.produit = produit;
    }

    public int getCommande() {
        return commande;
    }

    public void setCommande(int commande) {
        this.commande = commande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) produit;
        hash += (int) commande;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriquecommandePK)) {
            return false;
        }
        HistoriquecommandePK other = (HistoriquecommandePK) object;
        if (this.produit != other.produit) {
            return false;
        }
        if (this.commande != other.commande) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.HistoriquecommandePK[ produit=" + produit + ", commande=" + commande + " ]";
    }
    
}
