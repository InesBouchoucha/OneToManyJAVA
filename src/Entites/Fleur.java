/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Fleur {
    
    private int id;
    private String nom;
    private int nbrpetals;

    public Fleur() {
    }

    public Fleur(String nom, int nbrpetals) {
        this.nom = nom;
        this.nbrpetals = nbrpetals;
    }

    public Fleur(int id, String nom, int nbrpetals) {
        this.id = id;
        this.nom = nom;
        this.nbrpetals = nbrpetals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrpetals() {
        return nbrpetals;
    }

    public void setNbrpetals(int nbrpetals) {
        this.nbrpetals = nbrpetals;
    }

    @Override
    public String toString() {
        return "Fleur{" + "id=" + id + ", nom=" + nom + ", nbrpetals=" + nbrpetals + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.nom);
        hash = 53 * hash + this.nbrpetals;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fleur other = (Fleur) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nbrpetals != other.nbrpetals) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    
    
}
