/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Technique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DataSource {
    
    private static DataSource data;
    
    private Connection con;
    public String user="root";
    public String password="";
    public String url="jdbc:mysql://localhost:3306/pidev";
    
    private DataSource(){
      
        try {
            con= DriverManager.getConnection(url, user, password);
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        

    
    public static DataSource getInstance(){
    
        if (data == null)
                data=new DataSource();
       
            return data;
    }
    
    public Connection getCon(){
        return con;
    }
    
}
