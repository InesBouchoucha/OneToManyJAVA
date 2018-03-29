/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entites.Regime;
import Services.RegimeService;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jaoua
 */
public class AddRegimeController implements Initializable {

    @FXML
    private TextField duree;
    @FXML
    private TextArea description;
    @FXML
    private TextField name;
    @FXML
    private ChoiceBox<String> type;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ArrayList<String> L = new ArrayList();
        
       L.add("Régime Sportif");
       L.add("Régime Végétarien");
       L.add("Régime minceur");
       ObservableList<String> listt = FXCollections.observableArrayList(L);
       type.setItems(listt);
       type.getSelectionModel().select("Régime Sportif");
    }    
    @FXML
    private void ajouterRegime(ActionEvent event) throws IOException {
        RegimeService RS = new RegimeService();
        Regime R = new Regime();
         R.setTitre(name.getText());
        R.setDuree(Integer.parseInt(duree.getText()));
        R.setDescription(description.getText());
        //R.setDate(new Date(2017, 1, 1));
        R.setType(type.getValue());
       //name.setText("okokokokok");
       
        //R.setType("Regime blalalalal");
        RS.AjouterRegime(R);
        /*FXMLLoader loader = new FXMLLoader(getClass().getResource("secondpage.fxml"));
        Parent root = loader.load();
        SecondpageController c = loader.getController();
        c.setConfirmer("Régime : "+name.getText()+"duréé "+duree.getText());
        name.getScene().setRoot(root);*/
        System.out.println(R.toString());
        
        
        
    }
    
}
