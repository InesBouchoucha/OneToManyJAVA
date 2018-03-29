/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */

public class ArticleRate {


   
    protected ArticleRatePK articleRatePK;
   
    private Date date;
  
    private Article article;
   
    private Utilisateur utilisateur;

    public ArticleRate() {
    }

    public ArticleRate(ArticleRatePK articleRatePK) {
        this.articleRatePK = articleRatePK;
    }

    public ArticleRate(ArticleRatePK articleRatePK, Date date) {
        this.articleRatePK = articleRatePK;
        this.date = date;
    }

    public ArticleRate(int articleId, int userId) {
        this.articleRatePK = new ArticleRatePK(articleId, userId);
    }

    public ArticleRatePK getArticleRatePK() {
        return articleRatePK;
    }

    public void setArticleRatePK(ArticleRatePK articleRatePK) {
        this.articleRatePK = articleRatePK;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (articleRatePK != null ? articleRatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArticleRate)) {
            return false;
        }
        ArticleRate other = (ArticleRate) object;
        if ((this.articleRatePK == null && other.articleRatePK != null) || (this.articleRatePK != null && !this.articleRatePK.equals(other.articleRatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entites.ArticleRate[ articleRatePK=" + articleRatePK + " ]";
    }
    
}
