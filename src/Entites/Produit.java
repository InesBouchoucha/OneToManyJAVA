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
public class Produit {
    
    private int id;
    private String nom;
    private double prix;
    private String description;
    private int nb_enstock;
    private String image_produit;
    private String type_produit;

    public Produit() {
    }

    public Produit(String nom, double prix, String description, int nb_enstock, String image_produit, String type_produit) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nb_enstock = nb_enstock;
        this.image_produit = image_produit;
        this.type_produit = type_produit;
    }

    public Produit(int id ,String nom, double prix, String description, int nb_enstock) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nb_enstock = nb_enstock;
    }

    public Produit(int id, String nom, double prix, String description, int nb_enstock, String image_produit, String type_produit) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.nb_enstock = nb_enstock;
        this.image_produit = image_produit;
        this.type_produit = type_produit;
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_enstock() {
        return nb_enstock;
    }

    public void setNb_enstock(int nb_enstock) {
        this.nb_enstock = nb_enstock;
    }

    public String getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }

    public String getType_produit() {
        return type_produit;
    }

    public void setType_produit(String type_produit) {
        this.type_produit = type_produit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.nom);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.prix) ^ (Double.doubleToLongBits(this.prix) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.nb_enstock;
        hash = 83 * hash + Objects.hashCode(this.image_produit);
        hash = 83 * hash + Objects.hashCode(this.type_produit);
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
        final Produit other = (Produit) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.prix) != Double.doubleToLongBits(other.prix)) {
            return false;
        }
        if (this.nb_enstock != other.nb_enstock) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.image_produit, other.image_produit)) {
            return false;
        }
        if (!Objects.equals(this.type_produit, other.type_produit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", nom=" + nom + ", prix=" + prix + ", description=" + description + ", nb_enstock=" + nb_enstock + ", image_produit=" + image_produit + ", type_produit=" + type_produit + '}';
    }
    
    
    
    
   
    
    
}
