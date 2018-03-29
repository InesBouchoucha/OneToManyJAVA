/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;


import java.util.Collection;
import java.util.Date;


/**
 *
 * @author User
 */

public class Commande {

    
    private Integer id;
 
    private Date date;
  
    private String etat;

    private Collection<Historiquecommande> historiquecommandeCollection;

    private Utilisateur user;
 
    private Collection<Lignecommande> lignecommandeCollection;

    public Commande() {
    }

    public Commande(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Collection<Historiquecommande> getHistoriquecommandeCollection() {
        return historiquecommandeCollection;
    }

    public void setHistoriquecommandeCollection(Collection<Historiquecommande> historiquecommandeCollection) {
        this.historiquecommandeCollection = historiquecommandeCollection;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }

    public Collection<Lignecommande> getLignecommandeCollection() {
        return lignecommandeCollection;
    }

    public void setLignecommandeCollection(Collection<Lignecommande> lignecommandeCollection) {
        this.lignecommandeCollection = lignecommandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Commande[ id=" + id + " ]";
    }
    
}
