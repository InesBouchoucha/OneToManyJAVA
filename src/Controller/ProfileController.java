/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author jaoua
 */
public class ProfileController implements Initializable {

    @FXML
    private Circle circle;
    @FXML
    private JFXButton add;
    @FXML
    private JFXButton update;
    @FXML
    private AnchorPane content;
    @FXML
    private AnchorPane menu;
    @FXML
    private JFXButton add1;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                Image im = new Image("https://juicylinksmag.files.wordpress.com/2016/02/juliet-ibrahim.jpg");
                circle.setFill(new ImagePattern(im));
               
 try {
      
         setNode(new FXMLLoader().load(getClass().getResource("/FxInterface/AddRegime.fxml")));
       
     } catch (IOException ex) {
         Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
     }
    }    
    
    public void setNode(Node node) {
        content.getChildren().clear();
        content.getChildren().add((Node) node);

        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
    }
    @FXML
    public void switchAddRegime(ActionEvent event)
    {
         System.out.println("heheheheheheh");

    try {
         setNode(new FXMLLoader().load(getClass().getResource("/FxInterface/AddRegime.fxml")));
         System.out.println("heheheheheheh");
     } catch (IOException ex) {
         Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
     }   
    }
    @FXML
    public void switchUpdateRegime(ActionEvent event)
    {
    try {
         setNode(new FXMLLoader().load(getClass().getResource("/FxInterface/bladuibal.fxml")));
     } catch (IOException ex) {
         Logger.getLogger(ProfileController.class.getName()).log(Level.SEVERE, null, ex);
     }   
    }

    @FXML
    private void Exit(ActionEvent event) {
        exit();
    }
}
