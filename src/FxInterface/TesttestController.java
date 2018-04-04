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
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import jfxtras.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author jaoua
 */
public class TesttestController implements Initializable {

    @FXML
    private VBox anchor;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        for (int i=0; i <10; i++)
        {
    Button buttonSave = new Button("Save");
    ImageView img = new ImageView("https://juicylinksmag.files.wordpress.com/2016/02/juliet-ibrahim.jpg");
    Label l = new Label("zaeazezaezaeza");
    AnchorPane hb = new AnchorPane();
    hb.setPadding(new Insets(10, 10, 10, 10));
    //hb.setSpacing(10);
    img.setFitHeight(101);
    img.setFitWidth(111);
    hb.getChildren().add(img);
    hb.getChildren().add(buttonSave);
    hb.getChildren().add(l);
    l.setLayoutY(99);
    buttonSave.setLayoutY(130);
   
    anchor.getChildren().add(hb);
           
        }
    }    

    
}
