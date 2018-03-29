/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entites.Fleur;
import Services.FleurServices;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AjouterFleurController implements Initializable {

    @FXML
    private TextField nomfleur;
    @FXML
    private TextField nbrpetal;
    @FXML
    private Button btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterfleur(ActionEvent event) throws IOException {
        
        /*FleurServices fs = new FleurServices();
        Fleur f = new Fleur(nomfleur.getText(), Integer.parseInt(nbrpetal.getText()));
        fs.AjouterFleur(f);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("secondpage.fxml"));
        Parent root = loader.load();
        SecondpageController c = loader.getController();
        c.setConfirmer("Fleur : "+nomfleur.getText()+"qui a un nombre de pétals "+nbrpetal.getText());
        nbrpetal.getScene().setRoot(root);*/
    
}
}
