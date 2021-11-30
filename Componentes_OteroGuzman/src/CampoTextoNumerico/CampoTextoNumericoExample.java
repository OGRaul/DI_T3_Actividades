/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CampoTextoNumerico;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author raul
 */
public class CampoTextoNumericoExample extends Application{
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //Creando la escena 
        VBox root = new VBox();
        root.setPadding( new Insets (20));
        root.setSpacing(10);
        
        primaryStage.setScene(new Scene(root,600,400));
        
        primaryStage.setTitle("Custom Control");
        primaryStage.show();
       
        //Creando los objetos y añadiendolos al root
        CampoTextoNumerico ctn = new CampoTextoNumerico();
        
        root.getChildren().addAll(ctn);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
