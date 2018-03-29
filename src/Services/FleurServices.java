/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entites.Fleur;
import Entites.Produit;
import Technique.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class FleurServices {
    
  private Connection con = DataSource.getInstance().getCon();
  private Statement state;
  
  public FleurServices()
  {
      try {
          state=con.createStatement();
      } catch (SQLException ex) {
          Logger.getLogger(FleurServices.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  }
  
    public void AjouterProduit(Produit p){
  
      try {
          String req = "INSERT INTO Produit (nom,prix,description,nb_enstock,image_produit,type_produit) VALUES (?,?,?,?,?,?)";
          PreparedStatement pre = con.prepareStatement(req);
          pre.setString(1, p.getNom());
          pre.setDouble(2, p.getPrix());
         
          pre.setString(3, p.getDescription());
          pre.setInt(4, p.getNb_enstock());
          pre.setString(5, p.getImage_produit());
          pre.setString(6, p.getType_produit());
          
          pre.executeUpdate();
          
      } catch (SQLException ex) {
          Logger.getLogger(FleurServices.class.getName()).log(Level.SEVERE, null, ex);
      }
     
  
  }
  
  public List<Produit> AffiherProduit() throws SQLException
  {
    
          String req = "SELECT * FROM Produit"; 
          ResultSet rs = state.executeQuery(req);
          List<Produit> produits = new ArrayList<>();
          while (rs.next()){
          produits.add(new Produit(rs.getInt(1),rs.getString("nom"),rs.getDouble(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7)));  
          } 
           return produits;
  
}
  public void modifierprod(int id,String Nom_prod,double Prix_prod,String desc_prod, int nb_enstock) {
         
         String req ="UPDATE Produit SET nom=?,prix=?,description=?,nb_enstock=? where id=?";
         
         
        try {
           PreparedStatement pre = con.prepareStatement(req);
            
        
            pre.setString(1, Nom_prod);
            pre.setDouble(2,Prix_prod);
            pre.setString(3,desc_prod);
            pre.setInt(4,nb_enstock);
            pre.setInt(5,id);
   
            pre.executeUpdate();
            System.out.println("UPDATE AVEC SUCCES");
            return ;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         System.out.println(" ERREUR UPDATE");
    }
  
  
   public void delete(Integer id_produit) {
            String req = "delete from Produit where id =?";
        try {
           PreparedStatement pre = con.prepareStatement(req);
            pre.setInt(1, id_produit);
            pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
 
    
    
  
  /*public void AjouterFleur(Fleur f){
  
      try {
          String req = "INSERT INTO Fleur (nom,nbpetals) VALUES (?,?)";
          PreparedStatement pre = con.prepareStatement(req);
          pre.setString(1, f.getNom());
          pre.setInt(2, f.getNbrpetals());
          pre.executeUpdate();
          
      } catch (SQLException ex) {
          Logger.getLogger(FleurServices.class.getName()).log(Level.SEVERE, null, ex);
      }
     
  
  }*/
  
  /*public List<Fleur> AffiherFleur() throws SQLException
  {
    
          String req = "SELECT * FROM Fleur"; 
          ResultSet rs = state.executeQuery(req);
          List<Fleur> fleurs = new ArrayList<>();
          while (rs.next()){
          fleurs.add(new Fleur(rs.getInt(1),rs.getString("nom"),rs.getInt(3)));  
          } 
           return fleurs;
  
}*/

  

}