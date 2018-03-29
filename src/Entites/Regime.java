/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.util.Date;

/**
 *
 * @author User
 */

public class Regime {

  
    private Integer id;
  
    private String description;
   
    private String img;
   
    private Date date;
   
    private String titre;
    
    private int duree ;
    
    private Utilisateur nutri ;
    
    private String type ;

    public Regime() {
    }

    public Regime(Integer id) {
        this.id = id;
    }

    public Regime(Integer id, String description, String img, Date date, String titre) {
        this.id = id;
        this.description = description;
        this.img = img;
        this.date = date;
        this.titre = titre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Utilisateur getNutri() {
        return nutri;
    }

    public void setNutri(Utilisateur nutri) {
        this.nutri = nutri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        if (!(object instanceof Regime)) {
            return false;
        }
        Regime other = (Regime) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.Regime[ id=" + id + " ] "+titre+"-----"+type+"----"+description;
    }
    
}
