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

public class RegimeRate {

    
    private Integer id;
 
    private int valeur;

    private int idUser;

    private int idRegime;

    public RegimeRate() {
    }

    public RegimeRate(Integer id) {
        this.id = id;
    }

    public RegimeRate(Integer id, int valeur, int idUser, int idRegime) {
        this.id = id;
        this.valeur = valeur;
        this.idUser = idUser;
        this.idRegime = idRegime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdRegime() {
        return idRegime;
    }

    public void setIdRegime(int idRegime) {
        this.idRegime = idRegime;
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
        if (!(object instanceof RegimeRate)) {
            return false;
        }
        RegimeRate other = (RegimeRate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.RegimeRate[ id=" + id + " ]";
    }
    
}
