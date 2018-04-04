/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.Section;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author jaoua
 */
public class CalculIMCController implements Initializable {

    @FXML
    private JFXTextField taille;
    @FXML
    private JFXTextField poids;
    @FXML
    private JFXButton imcbtn;
    @FXML
    private Gauge gauge;
    @FXML
    private Label result;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // gauge.addArea(new Section(0,500, Color.GREENYELLOW));
        //gauge.addArea(new Section(500,1000,Color.RED));
        gauge.setTickLabelSections(new Section(0,500,Color.BLUE));
        gauge.setTickLabelSectionsVisible(true);
        gauge.setTickLabelColor(Color.BLUE);
        gauge.setTickMarkSections(new Section(500,800,Color.BLACK));
        gauge.setTickMarkRingVisible(true);
        gauge.setTickMarkColor(Color.BLUE);
        gauge.addSection(new Section(0,18.5, Color.RED));
        gauge.addSection(new Section(18.5,25,Color.YELLOWGREEN));
        gauge.addSection(new Section(25,30,Color.ORANGERED));
        gauge.addSection(new Section(30,100,Color.RED));
        gauge.setDecimals(2);
        gauge.setAnimated(true);
        gauge.setAnimationDuration(1000);
    }    

    @FXML
    private void CalculIMC(ActionEvent event) {
        
        double t = Double.parseDouble(taille.getText());
        int p = Integer.parseInt(poids.getText());
        double imc = (double) (p / ((t/100)*(t/100)));

        gauge.setValue(imc);
        if (imc < 16.5)
        {   result.setVisible(true);
            result.setText("Vous souffrez de dénutrition");
            result.setTextFill(Color.RED);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> result.setVisible(false)),
                                 new KeyFrame(Duration.seconds(1.5), evt -> result.setVisible(true)));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();}
        else if ((imc >16.5)&&(imc < 18.5))
        {   
            result.setVisible(true);
            result.setText("Vous étes trop maigre ");
            result.setTextFill(Color.RED);        }
        else if ((imc >18.5)&&(imc<25))
        {   
            result.setVisible(true);
            result.setText("Vous avez une corpulence normale");
            result.setStyle("-fx-text-fill : #6bc513");
        }
        else if ((imc > 25 )&& (imc <30))
        {
            result.setVisible(true);
            result.setText("Vous étes en surpoids !");
            result.setTextFill(Color.RED);
        }
        else if ((imc > 30 )&& (imc <35))
        {
            result.setVisible(true);
            result.setText("Vous souffrez d'obésité modérée");
            result.setTextFill(Color.RED);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> result.setVisible(false)),
                                 new KeyFrame(Duration.seconds(1.5), evt -> result.setVisible(true)));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();      
        }
        else if ((imc > 35 )&& (imc <40))
        {   
            result.setVisible(true);
            result.setText("Vous avez une corpulence sévère");
            result.setTextFill(Color.RED);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> result.setVisible(false)),
                                 new KeyFrame(Duration.seconds(1.5), evt -> result.setVisible(true)));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
        else
        {   result.setVisible(true);
            result.setText("Vous souffrez d'obésité morbide !!!");
            result.setTextFill(Color.RED);
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt -> result.setVisible(false)),
                                 new KeyFrame(Duration.seconds(1.5), evt -> result.setVisible(true)));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
        
        
        System.out.println(imc);
        
        
        
    }
    
    
}
