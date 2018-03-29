/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entites.Produit;
import Entites.Regime;
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
 * @author jaoua
 */
public class RegimeService {
  private Connection con = DataSource.getInstance().getCon();
  private Statement state;
  
    public RegimeService()
  {
      try {
          state=con.createStatement();
      } catch (SQLException ex) {
          Logger.getLogger(FleurServices.class.getName()).log(Level.SEVERE, null, ex);
      }
      
  }
    
     public void AjouterRegime(Regime R){
  
      try {
          String req = "INSERT INTO Regime (description,type,titre,duree) VALUES (?,?,?,?)";
          PreparedStatement pre = con.prepareStatement(req);
          pre.setString(1, R.getDescription());
          pre.setString(2, R.getType());
          pre.setString(3, R.getTitre());
          pre.setInt(4, R.getDuree());
          
          pre.executeUpdate();
          
      } catch (SQLException ex) {
          Logger.getLogger(RegimeService.class.getName()).log(Level.SEVERE, null, ex);
      }
     
  
  }
     public List<Regime> AfficherRegimes() throws SQLException
     {
  
             String req = "SELECT * FROM regime";
             ResultSet rs = state.executeQuery(req);
          List<Regime> Regimes = new ArrayList<>();
          while (rs.next()){
          Regime R = new Regime();
          R.setTitre(rs.getString("titre"));
          R.setDescription(rs.getString("description"));
          R.setType(rs.getString("titre"));
          R.setDuree(rs.getInt("duree"));
          Regimes.add(R);
          } 
           return Regimes;
     }
  
  
  
  
  
  
}
