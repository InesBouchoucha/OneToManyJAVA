/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import eu.hansolo.medusa.Gauge;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author jaoua
 */
public class CalculPIController implements Initializable {

    @FXML
    private JFXComboBox<String> sexe;
    @FXML
    private JFXTextField taille;
    @FXML
    private JFXButton pibtn;
    @FXML
    private Label pi;
    
   
    /**
     * Initializes the controller class.
     */

    public void initialize(URL url, ResourceBundle rb) {
        
        /*Timeline timeline = new Timeline();
         timeline.setCycleCount(Animation.INDEFINITE);
        for (int i = 0 ; i < 10 ; i++)
        {
        final KeyFrame k = new KeyFrame(Duration.seconds(1), (event) -> 
            pi.setText(String.valueOf(i)));
        timeline.getKeyFrames().add(k);
        timeline.play();
        }*/
                
             

      
        ArrayList<String> L = new ArrayList();
        
       L.add("Homme");
       L.add("Femme");
       ObservableList<String> listt = FXCollections.observableArrayList(L);
       sexe.setItems(listt);
                taille.lengthProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
		  if (newValue.intValue() > oldValue.intValue()) {
			  char ch = taille.getText().charAt(oldValue.intValue());
			  // Check if the new character is the number or other's
			  if (!(ch >= '0' && ch <= '9' )) {
				   // if it's not number then just setText to previous one
				   taille.setText(taille.getText().substring(0,taille.getText().length()-1)); 
			  }
		 }
	}
 
});
       
       
       
       
       
       
       
    }    

    @FXML
    private void CalculPI(ActionEvent event) {
       
        double pi =0 ;
        double t =  Double.parseDouble(taille.getText());
        if (sexe.getValue()=="Homme")
        {
            pi = t -100-((t-150)/4);
        }
        else if (sexe.getValue()=="Femme")
        {
            pi = t -100-((t-150)/2.5);
        }
        
    }
    
}
