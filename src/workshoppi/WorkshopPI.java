/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshoppi;
import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.GaugeBuilder;
import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class WorkshopPI extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
   

       Parent root = FXMLLoader.load(getClass().getResource("/FxInterface/CalculPI.fxml"));
        
       Scene scene = new Scene(root);
        primaryStage.setTitle("add regime");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        
        launch(args);
        
        
        
    }
    
}
