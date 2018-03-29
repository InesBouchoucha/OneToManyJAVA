/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FxInterface;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXScrollPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import jfxtras.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author jaoua
 */
public class TesttestController implements Initializable {

    @FXML
    private ScrollPane scroll;
    @FXML
    private AnchorPane anchor;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for (int i=0; i <10; i++)
        {
           Button btn = new Button();
           btn.setText("dududu");
           
        }
    }    

    
}
