/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshoppi;

import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.GaugeBuilder;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class firstpage extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
   
       AnchorPane root = new AnchorPane();
        Gauge gauge = GaugeBuilder.create()  
                          .title("Title")
                .skinType(Gauge.SkinType.SLIM)
                          .subTitle("SubTitle")
                .value(250).maxValue(500).minValue(0)
                          .unit("Unit")   
                          .build();  
        gauge.setBarColor(Color.GREEN);
        
        root.getChildren().add(gauge);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Page ajouter fleur");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
